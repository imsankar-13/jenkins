/*
 * @ClassName MovieManager
 * @Version 1.7
 * @Date 31-Dec-2016
 * @copyright 
 * 
 * This is the service(DTO) class for the Movies.
 */
package com.aspire.cinemagic.dto;

import java.util.ArrayList;

import com.aspire.cinemagic.bean.Movie;
import com.aspire.cinemagic.dao.MovieDAO;

/**
 * This is the service(DTO) class for the Movies.
 * @author aspire
 */
public class MovieManager {
	
	/**
	 * This method returns an array-list of Movie class.
	 * @return
	 */
	public ArrayList<Movie> getMovieList() {
		MovieDAO list = new MovieDAO();
		ArrayList<Movie> movieList = list.getMovieListFromDatabase();
		return movieList;
	}
}
