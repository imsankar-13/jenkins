package com.aspire.cinemagic.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aspire.cinemagic.bean.PrintedTicket;
import com.aspire.cinemagic.dto.TicketManager;

/**
 * Servlet implementation class DisplayLastTicket
 */
public class DisplayLastTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayLastTicket() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TicketManager ticketAccess = new TicketManager();
		HttpSession session = request.getSession();
		String username=(String) session.getAttribute("username");
		ArrayList<PrintedTicket> ticketList = ticketAccess.getTicket(username);
		session.setAttribute("tickets", ticketList);
		RequestDispatcher rd = request.getRequestDispatcher("PrintTicket.jsp");
		rd.forward(request, response);
	}

}
