/*
 * @ClassName DisplayShowsForTheMovie
 * @Version 1.7
 * @Date 31-Dec-2016
 * @copyright 
 * 
 * This is the servlet for displaying the shows for this movie.
 */
package com.aspire.cinemagic.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aspire.cinemagic.bean.MovieShow;
import com.aspire.cinemagic.dto.ShowsManager;

/**
 * Servlet implementation class DisplayShowsForTheMovie
 */
public class DisplayShowsForTheMovie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayShowsForTheMovie() {
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
		//HttpSession session = request.getSession(); 
		//String username = request.getParameter("username");
		//session.setAttribute("username",username);
		int movieId = Integer.parseInt(request.getParameter("movieId"));
		ShowsManager showsManager = new ShowsManager();
		ArrayList<MovieShow> showList=showsManager.getShowsForThisMovie(movieId);
		request.setAttribute("shows", showList);
		RequestDispatcher rd = request.getRequestDispatcher("showlist.jsp");
		rd.forward(request, response);
	}
}
