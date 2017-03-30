package com.aspire.cinemagic.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aspire.cinemagic.bean.Result;
import com.aspire.cinemagic.dto.UsersManager;

/**
 * Servlet implementation class SignUp
 */
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignUp() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String question = request.getParameter("question");
		String answer = request.getParameter("answer");
		UsersManager registration = new UsersManager();
		Result result =registration.registerUser(username, password, question, answer);
		request.setAttribute("message", result.getErrorMessage());
		System.out.println(result.getErrorMessage());
		RequestDispatcher rd = request.getRequestDispatcher(result.getRedirectPage());
		rd.forward(request, response);
	}
}
