package com.aspire.cinemagic.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aspire.cinemagic.bean.Movie;
import com.aspire.cinemagic.bean.Result;
import com.aspire.cinemagic.dto.MovieManager;
import com.aspire.cinemagic.dto.UsersManager;

/**
 * Servlet implementation class LoginToCineMagic
 */
public class LoginToCineMagic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginToCineMagic() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String action = request.getParameter("action");
		
		UsersManager validation = new UsersManager();
		Result result = validation.validateUser(username, password);
		System.out.println("Login successsful.");
		
		if(action.equals("login")) {
			if(result.getErrorMessage()!=null) {
				request.setAttribute("error",result.getErrorMessage());
			} else {
				HttpSession session = request.getSession();
				MovieManager movieManager = new MovieManager();
				ArrayList<Movie> movieList =movieManager.getMovieList();
				System.out.println(movieList);
				session.setAttribute("movies",movieList);
				session.setAttribute("username", username);
				session.setMaxInactiveInterval(600);
			}
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(result.getRedirectPage());
		rd.forward(request, response);
	}

}

//		if(validation.validateUser(username, password)) {
//			MovieManager movieManager = new MovieManager();
//			HttpSession session = request.getSession();
//			ArrayList<Movie> movieList =movieManager.getMovieList();
//			session.setAttribute("movies",movieList);
//			session.setAttribute("username", username);
//			session.setMaxInactiveInterval(200);
//			RequestDispatcher rd = request.getRequestDispatcher("Cinemagic.jsp");
//			rd.forward(request, response);
//		} else {
//			//response.sendRedirect("loginpage.jsp");
//			PrintWriter out = response.getWriter();
//			out.println("<script type=\"text/javascript\">" + "alert('Login unsuccessful.Please check the fields');"
//			+ "window.location='loginpage.jsp'" + "</script>");
//		}