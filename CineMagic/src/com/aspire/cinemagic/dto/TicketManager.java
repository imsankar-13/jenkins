/*
 * @ClassName TicketManager
 * @Version 1.7
 * @Date 31-Dec-2016
 * @copyright 
 * 
 * This is the service(DTO) class for the Tickets.
 */
package com.aspire.cinemagic.dto;

import java.util.ArrayList;

import com.aspire.cinemagic.bean.PrintedTicket;
import com.aspire.cinemagic.bean.TicketBuyer;
import com.aspire.cinemagic.dao.TicketDAO;

/**
 * This is the service(DTO) class for the Tickets.
 * @author aspire
 */
public class TicketManager {
	
	/**
	 * This method returns the array-list of tickets.
	 * @param username
	 * @return
	 */
	public ArrayList<PrintedTicket> getTicketList(String username) {
		TicketDAO dao = new TicketDAO();
		TicketBuyer user = new TicketBuyer();
		user.setUsername(username);
		return dao.getTicketListFromDatabase(user);
	}
	
	public ArrayList<PrintedTicket> getTicket(String username) {
		TicketDAO dao = new TicketDAO();
		TicketBuyer user = new TicketBuyer();
		user.setUsername(username);
		return dao.getLastTicketFromDatabase(user);
	}
}
