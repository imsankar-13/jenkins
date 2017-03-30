/*
 * @ClassName ShowsManager
 * @Version 1.7
 * @Date 31-Dec-2016
 * @copyright 
 * 
 * This is the service(DTO) class for the Movie-shows.
 */
package com.aspire.cinemagic.dto;

import java.util.ArrayList;

import com.aspire.cinemagic.bean.Movie;
import com.aspire.cinemagic.bean.MovieShow;
import com.aspire.cinemagic.dao.MovieShowsDAO;

/**
 * This is the service(DTO) class for the Movie-shows.
 * @author aspire
 */
public class ShowsManager {
	
	/**
	 * This method returns the shows for a movie.
	 * @param movieId
	 * @return
	 */
	public ArrayList<MovieShow> getShowsForThisMovie(int movieId) {
		Movie movie = new Movie();
		movie.setMovieId(movieId);
		MovieShowsDAO showListAccess = new MovieShowsDAO();
		return showListAccess.getShowsFromDatabase(movie);
	}
	
	/**
	 * This method returns the show details by show id.
	 * @param showId
	 * @return
	 */
	public MovieShow getShowDetails(int showId) {
		MovieShow show = new MovieShow();
		show.setShowID(showId);
		MovieShowsDAO showAccess = new MovieShowsDAO();
		return showAccess.getShowDetailsFromDatabase(show);
	}
 }
