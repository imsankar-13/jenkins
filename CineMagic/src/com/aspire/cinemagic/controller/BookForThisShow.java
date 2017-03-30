/*
 * @ClassName BookForThisShow
 * @Version 1.7
 * @Date 31-Dec-2016
 * @copyright 
 * 
 * This is the servlet for selecting the show.
 */
package com.aspire.cinemagic.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aspire.cinemagic.bean.MovieShow;
import com.aspire.cinemagic.dto.ShowsManager;

/**
 * Servlet implementation class BookForThisShow
 */
public class BookForThisShow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookForThisShow() {
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
		int showId=Integer.parseInt(request.getParameter("showId"));
		ShowsManager showsManager = new ShowsManager();
		MovieShow show = showsManager.getShowDetails(showId);
		String id=""+show.getShowID();
		String afct =""+show.getAvailableFirstClassTickets();
		String asct =""+show.getAvailableSecondClassTickets();
		String fctr =""+show.getFirstClassTicketRate();
		String sctr =""+show.getSecondClassTicketRate();
		request.setAttribute("id",id);
		request.setAttribute("afct",afct);
		request.setAttribute("asct",asct);
		request.setAttribute("fctr",fctr);
		request.setAttribute("sctr",sctr);
//		String username = request.getParameter("username");
//		HttpSession session = request.getSession();
//		session.setAttribute("username", username);
		RequestDispatcher rd = request.getRequestDispatcher("showDetails.jsp");
		rd.forward(request, response);
	}

}
