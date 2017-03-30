/*
 * @ClassName TicketBuyerDAO
 * @Version 1.7
 * @Date 31-Dec-2016
 * @copyright 
 * 
 * This is the DAO class for the Ticket.
 */
package com.aspire.cinemagic.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.aspire.cinemagic.bean.PrintedTicket;
import com.aspire.cinemagic.bean.Ticket;
import com.aspire.cinemagic.bean.TicketBuyer;
import com.aspire.cinemagic.constants.QueryConstants;
import com.aspire.cinemagic.utilities.DbUtil;

/**
 * This is the DAO class for the Ticket.
 * @author aspire
 */
public class TicketDAO {
	private Connection connection;
	
	/**
	 * This method books the ticket and updates in the database.
	 * @param ticket
	 * @param user
	 * @return
	 */
	public boolean bookTicketsInDatabase(Ticket ticket, TicketBuyer user) {
		try {
			connection = DbUtil.getConnection();
			int userId = retrieveUserId(user.getUsername(),connection);
			PreparedStatement statement = connection.prepareStatement(QueryConstants.INSERT_TICKETS);
			statement.setInt(1,ticket.getShowNumber());
			statement.setInt(2, userId);
			statement.setInt(3,ticket.getTicketClass());
			statement.setInt(4,ticket.getNoOfTickets());
			statement.setInt(5, ticket.getTicketAmount());
			if(statement.executeUpdate()>0) {
				if(reduceTicketsInShow(ticket,connection)>0) {
					
					return true;
				}
			}
			return false;
		} catch (ClassNotFoundException | IOException | SQLException exception) {
			System.out.println(exception + "occured.");
		}
		return false;
	}
	
	/**
	 * This method retrieves the user Id by the username.
	 * @param username
	 * @param connection
	 * @return
	 */
	private int retrieveUserId(String username,Connection connection) {
		try {
			PreparedStatement statement = connection.prepareStatement(QueryConstants.SELECT_USER_ID_FROM_NAME);
			statement.setString(1,username);
			ResultSet result = statement.executeQuery();
			result.first();
			return result.getInt(1);
		} catch (SQLException exception) {
			System.out.println("SQL Exception occured");
		}
		return 0;
	}
	
	/**
	 * This method reduces the number of tickets in the DB. 
	 * @param ticket
	 * @param connection
	 * @return
	 */
	private int reduceTicketsInShow(Ticket ticket,Connection connection) {
		try {
			int result;
			if(ticket.getTicketClass()==1) {
				PreparedStatement statement = connection.prepareStatement(QueryConstants.UPDATE_FC_TICKET_COUNT);
				statement.setInt(1,ticket.getNoOfTickets());
				statement.setInt(2, ticket.getShowNumber());
				result= statement.executeUpdate();
			}
			else {
				PreparedStatement statement = connection.prepareStatement(QueryConstants.UPDATE_SC_TICKET_COUNT);
				statement.setInt(1,ticket.getNoOfTickets());
				statement.setInt(2, ticket.getShowNumber());
				result = statement.executeUpdate();
			}
			return result;
		} catch (SQLException exception) {
			System.out.println("SQL Exception occured");
		}
		return 0;
	}
	
	/**
	 * This method returns the ticket list from the DB.
	 * @param user
	 * @return
	 */
	public ArrayList<PrintedTicket> getTicketListFromDatabase(TicketBuyer user) {
		try {
			connection = DbUtil.getConnection();
			int userId = retrieveUserId(user.getUsername(),connection);
			PreparedStatement statement = connection.prepareStatement(QueryConstants.GET_TICKETS_OF_THIS_USER);
			statement.setInt(1, userId);
			ResultSet result = statement.executeQuery();
			ArrayList<PrintedTicket> ticketList = new ArrayList<PrintedTicket>();
			
			while(result.next()) {
				PrintedTicket printedTicket = new PrintedTicket();
				printedTicket.setUsername(user.getUsername());
				printedTicket.setTicketId(result.getInt(1));
				printedTicket.setShowId(result.getInt(2));
				printedTicket=getShowDetails(printedTicket,connection);
				printedTicket=getMovieName(printedTicket,connection);
				printedTicket.setTicketClass(result.getInt(3));
				printedTicket.setNoOfTickets(result.getInt(4));
				printedTicket.setTicketAmount(result.getInt(5));
				ticketList.add(printedTicket);
			}

			return ticketList;
		} catch (ClassNotFoundException | IOException | SQLException exception) {
			System.out.println(exception + "occured.");
		}
		return null;
	}
	private PrintedTicket getShowDetails(PrintedTicket printedTicket, Connection connection) {
		try {
			PreparedStatement statement = connection.prepareStatement(QueryConstants.SELECT_SHOW_DETAILS_BY_ID);
			statement.setInt(1,printedTicket.getShowId());
			ResultSet result = statement.executeQuery();
			while(result.next()) { 
				printedTicket.setShowDate(result.getString(1));
				printedTicket.setShowTime(result.getString(2));
			}
			return printedTicket;
		} catch (SQLException exception) {
			System.out.println("SQL Exception occured");
		}
		return null;
	}
	private PrintedTicket getMovieName(PrintedTicket printedTicket, Connection connection) {
		try {
			PreparedStatement statement = connection.prepareStatement(QueryConstants.SELECT_MOVIE_NAME_BY_SHOWID);
			statement.setInt(1,printedTicket.getShowId());
			ResultSet result = statement.executeQuery();
			while(result.next()) { 
				printedTicket.setMovieName(result.getString(1));
			}
			return printedTicket;
		} catch (SQLException exception) {
			System.out.println("SQL Exception occured");
		}
		return null;
	}
	
	public ArrayList<PrintedTicket> getLastTicketFromDatabase(TicketBuyer user) {
		try {
			connection = DbUtil.getConnection();
			int userId = retrieveUserId(user.getUsername(),connection);
			PreparedStatement statement = connection.prepareStatement(QueryConstants.GET_LAST_TICKET);
			statement.setInt(1, userId);
			ResultSet result = statement.executeQuery();
			ArrayList<PrintedTicket> ticketList = new ArrayList<PrintedTicket>();
			
			while(result.next()) {
				PrintedTicket printedTicket = new PrintedTicket();
				printedTicket.setUsername(user.getUsername());
				printedTicket.setTicketId(result.getInt(1));
				printedTicket.setShowId(result.getInt(2));
				printedTicket=getShowDetails(printedTicket,connection);
				printedTicket=getMovieName(printedTicket,connection);
				printedTicket.setTicketClass(result.getInt(3));
				printedTicket.setNoOfTickets(result.getInt(4));
				printedTicket.setTicketAmount(result.getInt(5));
				ticketList.add(printedTicket);
			}

			return ticketList;
		} catch (ClassNotFoundException | IOException | SQLException exception) {
			System.out.println(exception + "occured.");
		}
		return null;
	}
}
