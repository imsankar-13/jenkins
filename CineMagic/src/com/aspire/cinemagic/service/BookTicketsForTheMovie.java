/*
 * @ClassName BookTicketsForTheMovie
 * @Version 1.7
 * @Date 31-Dec-2016
 * @copyright 
 * 
 * This is the service(DTO) class for the Booking tickets for the movie.
 */
package com.aspire.cinemagic.service;

import com.aspire.cinemagic.bean.Ticket;
import com.aspire.cinemagic.bean.TicketBuyer;
import com.aspire.cinemagic.dao.TicketDAO;

/**
 * This is the service(DTO) class for the Booking tickets for the movie.
 * @author aspire
 */
public class BookTicketsForTheMovie {
	
	/**
	 * This method acts as a service for booking the tickets.
	 * @param showId
	 * @param ticketClass
	 * @param tickets
	 * @param username
	 * @return
	 */
	public boolean bookTickets(int showId,int ticketClass, int tickets,String username) {
		Ticket ticket = new Ticket();
		ticket.setShowNumber(showId);
		ticket.setTicketClass(ticketClass);
		ticket.setNoOfTickets(tickets);
		if(ticketClass==1) {
			ticket.setTicketAmount(120*tickets);
		} else if(ticketClass==2) {
			ticket.setTicketAmount(100*tickets);
		}
		TicketBuyer user = new TicketBuyer();
		user.setUsername(username);
		TicketDAO ticketAccess = new TicketDAO();
		if(ticketAccess.bookTicketsInDatabase(ticket,user)) {
			return true;
		}
		return false;
	}
}
