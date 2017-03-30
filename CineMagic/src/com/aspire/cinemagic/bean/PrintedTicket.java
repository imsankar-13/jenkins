/*
 * @ClassName PrintedTicket
 * @Version 1.7
 * @Date 31-Dec-2016
 * @copyright 
 * 
 * This is the POJO class for the tickets to be printed.
 */
package com.aspire.cinemagic.bean;

/**
 * This is the POJO class for the tickets containing the details of the printed ticket.
 * @author aspire
 */
public class PrintedTicket {
	private String username;
	private int ticketId;
	private int showId;
	
	private String movieName;
	private String showDate;
	private String showTime;
	

	private int ticketClass;
	private int noOfTickets;
	private int ticketAmount;
	
	
	/**
	 * This returns the movie name of printed ticket.
	 * @return
	 */
	public String getMovieName() {
		return movieName;
	}
	
	/**
	 * This sets the movie name of printed ticket.
	 * @param movieName
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	/**
	 * This returns the show date of printed ticket.
	 * @return
	 */
	public String getShowDate() {
		return showDate;
	}
	
	/**
	 * This sets the show date of printed ticket.
	 * @param showDate
	 */
	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}
	
	/**
	 * This returns the show time of printed ticket.
	 * @return
	 */
	public String getShowTime() {
		return showTime;
	}
	
	/**
	 * This sets the show time of printed ticket.
	 * @param showTime
	 */
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	
	/**
	 * This returns the ticket id of printed ticket.
	 * @return
	 */
	public int getTicketId() {
		return ticketId;
	}
	
	/**
	 * This sets the ticket id of printed ticket.
	 * @param ticketId
	 */
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	
	/**
	 * This returns the ticket class of printed ticket.
	 * @return
	 */
	public int getTicketClass() {
		return ticketClass;
	}
	
	/**
	 * This sets the ticket id of printed ticket.
	 * @param ticketClass
	 */
	public void setTicketClass(int ticketClass) {
		this.ticketClass = ticketClass;
	}
	
	/**
	 * This returns the number of tickets of printed ticket.
	 * @return
	 */
	public int getNoOfTickets() {
		return noOfTickets;
	}
	
	/**
	 * This sets the number of tickets of printed ticket.
	 * @param noOfTickets
	 */
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	
	/**
	 * This returns the ticket amount of printed ticket.
	 * @return
	 */
	public int getTicketAmount() {
		return ticketAmount;
	}
	
	/**
	 * This sets the ticket amount of printed ticket.
	 * @param ticketAmount
	 */
	public void setTicketAmount(int ticketAmount) {
		this.ticketAmount = ticketAmount;
	}

	/**
	 * This returns the show id of printed ticket.
	 * @return
	 */
	public int getShowId() {
		return showId;
	}

	/**
	 * This sets the user id of printed ticket.
	 * @return
	 */
	public void setShowId(int showId) {
		this.showId = showId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
