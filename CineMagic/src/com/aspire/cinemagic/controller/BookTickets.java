/*
 * @ClassName BookTickets
 * @Version 1.7
 * @Date 31-Dec-2016
 * @copyright 
 * 
 * This is the servlet for selecting the show.
 */
package com.aspire.cinemagic.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aspire.cinemagic.service.BookTicketsForTheMovie;

/**
 * Servlet implementation class BookTickets
 */
public class BookTickets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookTickets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int ticketClass=Integer.parseInt(request.getParameter("ticketClass"));
		int showId=Integer.parseInt(request.getParameter("showId"));
		int tickets=Integer.parseInt(request.getParameter("quantity"));
		HttpSession session = request.getSession();
		String username=(String)session.getAttribute("username");
		BookTicketsForTheMovie booking = new BookTicketsForTheMovie();
		if(booking.bookTickets(showId,ticketClass,tickets,username)) {
			response.sendRedirect("DisplayLastTicket");
		}
		else {
			System.out.println("Not booked");
		}
	}
}
