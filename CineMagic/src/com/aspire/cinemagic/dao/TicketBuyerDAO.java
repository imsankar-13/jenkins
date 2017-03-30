/*
 * @ClassName TicketBuyerDAO
 * @Version 1.7
 * @Date 31-Dec-2016
 * @copyright 
 * 
 * This is the DAO class for the Ticket-buyer.
 */
package com.aspire.cinemagic.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.aspire.cinemagic.bean.TicketBuyer;
import com.aspire.cinemagic.constants.QueryConstants;
import com.aspire.cinemagic.utilities.DbUtil;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;

/**
 * This is the DAO class for the Ticket-buyer.
 * @author aspire
 */
public class TicketBuyerDAO {
	private Connection connection;

	/**
	 * This method inserts the user credentials into the DB.
	 * @param user
	 * @return
	 */
	public boolean insertUserCredentials(TicketBuyer user) {
		try {
			connection = DbUtil.getConnection();
			PreparedStatement statement=null;
			statement = connection.prepareStatement(QueryConstants.INSERT_INTO_TICKETBUYER);
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getQuestion());
			statement.setString(4, user.getAnswer());
			if (statement.executeUpdate() > 0) {
				return true;
			}
		} catch (ClassNotFoundException | IOException exception) {
			System.out.println(exception + "occured.");
			return false;
		} catch (MySQLIntegrityConstraintViolationException exception) {
			System.out.println("Username already exists.Try different name.");
			return false;
		} catch (SQLException exception) {
			System.out.println(exception + "occured.");
			return false;
		}
		return false;
	}

	/**
	 * This method validates the user credentials from the DB.
	 * @param user
	 * @return
	 */
	public boolean validateUserCredentials(TicketBuyer user) {
		try {
			connection = DbUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement(QueryConstants.SELECT_NAMES_OF_TICKETBUYER);
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				if(user.getUsername().equals(result.getString(1))) {
					if( retrieveUserPassword(user.getUsername(),connection).equals(user.getPassword()) ) {
						return true;
					}
					return false;
				}
			}
			return false;
		} catch (ClassNotFoundException | IOException | SQLException exception) {
			System.out.println(exception + "occured.");
			return false;
		}
	}
	
	/**
	 * This method retrieves the password of a user.
	 * @param username
	 * @param connection
	 * @return
	 */
	private String retrieveUserPassword(String username,Connection connection){
		try {
			PreparedStatement statement = connection.prepareStatement(QueryConstants.FETCH_USER_PASSWORD);
			statement.setString(1, username);
			ResultSet result = statement.executeQuery();
			result.first();
			return result.getString(1);
		}catch (SQLException exception) {
			System.out.println(exception + "occured.");
		}
		return "";
	}
}
