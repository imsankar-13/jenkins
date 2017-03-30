/*
 * @ClassName TicketBuyerPOJO
 * @Version 1.7
 * @Date 31-Dec-2016
 * @copyright 
 * 
 * This is the POJO class for the ticket-buyer.
 */
package com.aspire.cinemagic.bean;

/**
 * This is the POJO class for the ticket-buyer containing the details 
 * like user-name, password and initial payTm cash.
 * @author rathish
 */
public class TicketBuyer {
	private String username;
	private String password;
	private String question;
	private String answer;
	private int payTmCash;

	/**
	 * This returns the user-name 
	 * @return
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This sets the user-name for the user.
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * This returns the user-name for the user.
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This sets the password for the user.
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This returns the available payTm cash for the user.
	 * @return
	 */
	public int getPayTmCash() {
		return payTmCash;
	}

	/**
	 * This sets the payTm cash for the user.
	 * @param payTmCash
	 */
	public void setPayTmCash(int payTmCash) {
		this.payTmCash = payTmCash;
	}

	/**
	 * This returns the security question that user entered during signup.
	 * @return
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * This sets the security question that user entered during signup.
	 * @return
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * This returns the security answer that user entered during signup.
	 * @return
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * This sets the security answer that user entered during signup.
	 * @return
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
