/*
 * @ClassName UsersManager
 * @Version 1.7
 * @Date 31-Dec-2016
 * @copyright 
 * 
 * This is the service(DTO) class for the Users.
 */
package com.aspire.cinemagic.dto;

import com.aspire.cinemagic.bean.Result;
import com.aspire.cinemagic.bean.TicketBuyer;
import com.aspire.cinemagic.constants.StringConstants;
import com.aspire.cinemagic.dao.TicketBuyerDAO;

/**
 * This is the service(DTO) class for the users.
 * @author aspire
 */
public class UsersManager {
	
	/**
	 * This method registers the user into user database.
	 * @param username
	 * @param password
	 * @param question
	 * @param answer
	 * @return
	 */
	public Result registerUser(String username, String password, String question, String answer) {
		TicketBuyer user = new TicketBuyer();
		
		user.setUsername(username);
		user.setPassword(password);
		user.setQuestion(question);
		user.setAnswer(answer);
		TicketBuyerDAO userCredentials = new TicketBuyerDAO();
		Result result = new Result();
		if(userCredentials.insertUserCredentials(user)) {
			result.setErrorMessage(StringConstants.SIGNUP_SUCCESS);
		} else {
			result.setErrorMessage(StringConstants.SIGNUP_FAIL); 
		}
		result.setRedirectPage(StringConstants.LOGIN_PAGE);
		return result;
	}
	
	/**
	 * This method validates if the user exists in the database.
	 * @param username
	 * @param password
	 * @return
	 */
	public Result validateUser(String username, String password) {
		TicketBuyer user = new TicketBuyer();
		user.setUsername(username);
		user.setPassword(password);
		TicketBuyerDAO userCredentials = new TicketBuyerDAO();
		Result result = new Result();
		if(!userCredentials.validateUserCredentials(user)) {
			result.setErrorMessage(StringConstants.LOGIN_ERROR);
			result.setRedirectPage(StringConstants.LOGIN_PAGE);
		}
		else {
			result.setRedirectPage(StringConstants.HOME_PAGE);
		}
		return result;
	}
}
