/*
 * @ClassName Movie
 * @Version 1.7
 * @Date 31-Dec-2016
 * @copyright 
 * 
 * This is the POJO class that has the details of a Movie. 
 */
package com.aspire.cinemagic.bean;

/**
 * This is the POJO class that contains the details of a Movie. 
 * @author rathish
 */
public class Movie {
	private int movieId;
	private String movieName;
	private String yearReleased;
	private String genre;
	private String language;
	private String imageLink;
	
	/**
	 * This is the default constructor for Movie class with four parameters.
	 */
	public Movie() {
		
	}
	/**
	 * This is the constructor for Movie class with four parameters.
	 * @param movieName
	 * @param yearReleased
	 * @param genre
	 * @param language
	 */
	public Movie(String movieName, String yearReleased, String genre, String language) {
		this.setMovieName(movieName);
		this.setYearReleased(yearReleased);
		this.setGenre(genre);
		this.setLanguage(language);
	}
	
	/**
	 * This is the constructor for Movie class with five parameters.
	 * @param movieName
	 * @param yearReleased
	 * @param genre
	 * @param language
	 * @param show_3D
	 */
	Movie(String movieName, String yearReleased, String genre, String language, boolean show_3D) {
		this.setMovieName(movieName);
		this.setYearReleased(yearReleased);
		this.setGenre(genre);
		this.setLanguage(language);
	}

	/**
	 * This returns the movie name.
	 * @return
	 */
	public String getMovieName() {
		return movieName;
	}

	/**
	 * This sets the movie name.
	 * @param name
	 */
	public void setMovieName(String name) {
		this.movieName = name;
	}

	/**
	 * This returns the year of movie release.
	 * @return
	 */
	public String getYearReleased() {
		return yearReleased;
	}

	/**
	 * This set the year of movie release.
	 * @param yearReleased
	 */
	public void setYearReleased(String yearReleased) {
		this.yearReleased = yearReleased;
	}

	/**
	 * this returns the movie genre.
	 * @return
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * This sets the movie genre.
	 * @param genre
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * This returns the language of the movie.
	 * @return
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * This sets the language for the movie.
	 * @param language
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	
	/**
	 * This returns the image-link for the movie.
	 * @return
	 */
	public String getImageLink() {
		return imageLink;
	}
	/**
	 * This sets the image-link for the movie.
	 * @param imageLink
	 */
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}
	
	/**
	 * This returns the movie ID for the movie.
	 * @return
	 */
	public int getMovieId() {
		return movieId;
	}
	
	/**
	 * This sets the movie ID for the movie.
	 * @param movieId
	 */
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
}
