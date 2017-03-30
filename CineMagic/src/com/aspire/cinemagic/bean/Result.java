package com.aspire.cinemagic.bean;

public class Result {
	private String redirectPage;
	private TicketBuyer user;
	private String errorMessage;
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public TicketBuyer getUser() {
		return user;
	}
	public void setUser(TicketBuyer user) {
		this.user = user;
	}
	public String getRedirectPage() {
		return redirectPage;
	}
	public void setRedirectPage(String redirectPage) {
		this.redirectPage = redirectPage;
	}
}
