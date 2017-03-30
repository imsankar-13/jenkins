/*
 * @ClassName MovieDAO
 * @Version 1.7
 * @Date 31-Dec-2016
 * @copyright 
 * 
 * This is the DAO class for the Movies.
 */
package com.aspire.cinemagic.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.aspire.cinemagic.bean.Movie;
import com.aspire.cinemagic.constants.QueryConstants;
import com.aspire.cinemagic.utilities.DbUtil;

/**
 * This is the DAO class for the Movies.
 * @author aspire
 */
public class MovieDAO {
	private Connection connection;
	
	/**
	 * This method returns the list of movies from DB
	 * @return
	 */
	public ArrayList<Movie> getMovieListFromDatabase() {
		try {
			connection = DbUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement(QueryConstants.FETCH_MOVIE_LIST);
			ResultSet result = statement.executeQuery();
			
			ArrayList<Movie> movieList = new ArrayList<Movie>();
			
			while(result.next()) {
				Movie movie = new Movie();
				movie.setMovieName(result.getString(1));
				movie.setYearReleased(result.getString(2));
				movie.setGenre(result.getString(3));
				movie.setLanguage(result.getString(4));
				movie.setImageLink(result.getString(5));
				movie.setMovieId(result.getInt(6));
				movieList.add(movie);
			}
			
			return movieList;
		} catch (ClassNotFoundException | IOException | SQLException exception) {
			System.out.println(exception + "occured.");
		}
		return  null;
	}
}
