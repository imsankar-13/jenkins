/*
 * @ClassName Ticket
 * @Version 1.7
 * @Date 31-Dec-2016
 * @copyright 
 * 
 * This is the POJO class for the tickets.
 */
package com.aspire.cinemagic.bean;

/**
 * This is the POJO class for the tickets containing the details of the ticket.
 * @author rathish
 */
public class Ticket {
	private int ticketId;
	private int showNumber;
	private int movieNumber;
	private int ticketClass;
	private int noOfTickets;
	private int userId;
	private int ticketAmount;
	
	public int getShowNumber() {
		return showNumber;
	}

	public void setShowNumber(int showNumber) {
		this.showNumber = showNumber;
	}

	/**
	 * This returns the ticket Id of the ticket.
	 * @return
	 */
	public int getTicketId() {
		return ticketId;
	}

	/**
	 * This sets the ticket ID for the ticket.
	 * @param ticketId
	 */
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}


	/**
	 * This method sets returns number of seats for this ticket. 
	 * @return
	 */
	public int getNoOfTickets() {
		return noOfTickets;
	}

	/**
	 * This method sets the number of seats for this ticket. 
	 * @param noOfTickets
	 */
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	/**
	 * This returns the movie Id for the ticket.
	 * @return
	 */
	public int getMovieNumber() {
		return movieNumber;
	}

	/**
	 * This sets the movie Id for the ticket.
	 * @param movieNumber
	 */
	public void setMovieNumber(int movieNumber) {
		this.movieNumber = movieNumber;
	}

	/**
	 * This returns the user Id for the ticket.
	 * @return
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * This sets the user ID for the ticket.
	 * @param userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * This returns the ticket amount for the ticket.
	 * @return
	 */
	public int getTicketAmount() {
		return ticketAmount;
	}

	/**
	 * This sets the ticket amount for the ticket.
	 * @param ticketAmount
	 */
	public void setTicketAmount(int ticketAmount) {
		this.ticketAmount = ticketAmount;
	}

	/**
	 * This returns the ticket class for the ticket.
	 * @return
	 */
	public int getTicketClass() {
		return ticketClass;
	}

	/**
	 * This sets the ticket class for the ticket.
	 * @param ticketClass
	 */
	public void setTicketClass(int ticketClass) {
		this.ticketClass = ticketClass;
	}
}
