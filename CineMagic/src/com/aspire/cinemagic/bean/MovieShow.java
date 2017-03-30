/*
 * @ClassName MovieShowPOJO
 * @Version 1.7
 * @Date 31-Dec-2016
 * @copyright 
 * 
 * This is the POJO class for the movie shows.
 */
package com.aspire.cinemagic.bean;

/**
 * This is the POJO class for the movie shows containing the details like show-time, movie and available tickets.
 * @author rathish
 */
public class MovieShow {
	private int showID;
	private String showDate;
	private String showTime;
	private int availableFirstClassTickets;
	private int availableSecondClassTickets;
	private boolean show3D;
	private int firstClassTicketRate;
	private int secondClassTicketRate;
	private int movieId;
	
	/**
	 * This method returns the show time.
	 * @return
	 */
	public String getShowTime() {
		return showTime;
	}

	/**
	 * This method sets the show time.
	 * @param showTime
	 */
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	
	/**
	 * This method returns the available first class tickets.
	 * @return
	 */
	public int getAvailableFirstClassTickets() {
		return availableFirstClassTickets;
	}

	/**
	 * This method sets the available first class tickets.
	 * @param availableFirstClassTickets
	 */
	public void setAvailableFirstClassTickets(int availableFirstClassTickets) {
		this.availableFirstClassTickets = availableFirstClassTickets;
	}

	/**
	 * This method returns the available second class tickets.
	 * @return
	 */
	public int getAvailableSecondClassTickets() {
		return availableSecondClassTickets;
	}

	/**
	 * This method sets the available second class tickets.
	 * @param availableSecondClassTickets
	 */
	public void setAvailableSecondClassTickets(int availableSecondClassTickets) {
		this.availableSecondClassTickets = availableSecondClassTickets;
	}

	/**
	 * This method returns the show as 3d or not.
	 * @return
	 */
	public boolean isShow3D() {
		return show3D;
	}

	/**
	 * This method sets the show as 3d or not.
	 * @param show3D
	 */
	public void setShow3D(boolean show3D) {
		this.show3D = show3D;
	}

	/**
	 * This method returns the show Id.
	 * @return
	 */
	public int getShowID() {
		return showID;
	}

	/**
	 * This method sets the show Id.
	 * @param showID
	 */
	public void setShowID(int showID) {
		this.showID = showID;
	}

	/**
	 * This method returns the movie Id.
	 * @return
	 */
	public int getMovieId() {
		return movieId;
	}

	/**
	 * This method sets the movie Id.
	 * @param movieId
	 */
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	/**
	 * This method returns the first class ticket rate.
	 * @return
	 */
	public int getFirstClassTicketRate() {
		return firstClassTicketRate;
	}

	/**
	 * This method sets the first class ticket rate.
	 * @param firstClassTicketRate
	 */
	public void setFirstClassTicketRate(int firstClassTicketRate) {
		this.firstClassTicketRate = firstClassTicketRate;
	}

	/**
	 * This method returns the second class ticket rate.
	 * @return
	 */
	public int getSecondClassTicketRate() {
		return secondClassTicketRate;
	}

	/**
	 * This method sets the second class ticket rate.
	 * @param secondClassTicketRate
	 */
	public void setSecondClassTicketRate(int secondClassTicketRate) {
		this.secondClassTicketRate = secondClassTicketRate;
	}

	/**
	 * This method returns the show date.
	 * @return
	 */
	public String getShowDate() {
		return showDate;
	}

	/**
	 * This method sets the show date.
	 * @param secondClassTicketRate
	 */
	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}

}
