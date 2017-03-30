/*
 * @ClassName DisplayTickets
 * @Version 1.7
 * @Date 31-Dec-2016
 * @copyright 
 * 
 * This is the servlet for displaying the tickets booked by this user.
 */
package com.aspire.cinemagic.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aspire.cinemagic.bean.PrintedTicket;
import com.aspire.cinemagic.dto.TicketManager;


/**
 * Servlet implementation class DisplayTickets
 */
public class DisplayTickets extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayTickets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String username=(String) session.getAttribute("username");
		
		TicketManager ticketAccess = new TicketManager();
		ArrayList<PrintedTicket> ticketList = ticketAccess.getTicketList(username);  

		session.setAttribute("tickets", ticketList);
		RequestDispatcher rd = request.getRequestDispatcher("BookingHistory.jsp");
		rd.forward(request, response);
	}
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		TicketManager ticketAccess = new TicketManager();
//		HttpSession session = request.getSession();
//		String username=(String) session.getAttribute("username");
//		ArrayList<PrintedTicket> ticketList = ticketAccess.getTicketList(username);
//		session.setAttribute("tickets", ticketList);
//		RequestDispatcher rd = request.getRequestDispatcher("BookingHistory.jsp");
//		rd.forward(request, response);
//	}
}
