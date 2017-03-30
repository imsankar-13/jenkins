/*
 * @ClassName MovieShowsDAO
 * @Version 1.7
 * @Date 31-Dec-2016
 * @copyright 
 * 
 * This is the DAO class for the Movie-shows.
 */
package com.aspire.cinemagic.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.aspire.cinemagic.bean.Movie;
import com.aspire.cinemagic.bean.MovieShow;
import com.aspire.cinemagic.constants.QueryConstants;
import com.aspire.cinemagic.utilities.DbUtil;

/**
 * This is the DAO class for the Movie-shows.
 * @author aspire
 */
public class MovieShowsDAO {
	private Connection connection;
	
	/**
	 * This returns the movie-shows for a particular movie from the DB.
	 * @param movie
	 * @return
	 */
	public ArrayList<MovieShow> getShowsFromDatabase(Movie movie) {
		try {
			connection = DbUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement(QueryConstants.FETCH_SHOWS_FOR_THIS_MOVIE);
			statement.setInt(1, movie.getMovieId());
			ResultSet result = statement.executeQuery();
			
			ArrayList<MovieShow> showList = new ArrayList<MovieShow>();
			
			while(result.next()) {
				MovieShow show = new MovieShow();
				show.setShowDate(result.getString(1));
				show.setShowTime(result.getString(2));
				show.setShowID(result.getInt(3));
				showList.add(show);
			}
			return showList;
		} catch (ClassNotFoundException | IOException | SQLException exception) {
			System.out.println(exception + "occured.");
		}
		return  null;
	}
	
	/**
	 * This returns the show details of a single show from DB.
	 * @param show
	 * @return
	 */
	public MovieShow getShowDetailsFromDatabase(MovieShow show) {
		try {
			connection = DbUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement(QueryConstants.FETCH_SHOWS_DETAILS);
			statement.setInt(1, show.getShowID());
			ResultSet result = statement.executeQuery();
			result.first();
			show.setAvailableFirstClassTickets(result.getInt(1));
			show.setAvailableSecondClassTickets(result.getInt(2));
			show.setFirstClassTicketRate(result.getInt(3));
			show.setSecondClassTicketRate(result.getInt(4));
			show.setShowTime("Show Date:"+result.getString(5)+"  Show Time:"+result.getString(6));
			return show;
		} catch (ClassNotFoundException | IOException | SQLException exception) {
			System.out.println(exception + "occured.");
		}
		return null;
	}
}
