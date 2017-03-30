/*
 * @ClassName QueryConstants
 * @Version 1.7
 * @Date 31-Dec-2016
 * @copyright 
 * 
 * This is the class for query constants.
 */
package com.aspire.cinemagic.constants;

/**
 * This is the class for query constants.
 * @author aspire
 */
public class QueryConstants {
	public static final String INSERT_INTO_TICKETBUYER = "insert into TicketBuyer(username,password,security_question,security_answer) values(?,?,?,?)";

	public static final String SELECT_NAMES_OF_TICKETBUYER = "select username,user_id from TicketBuyer";

	public static final String FETCH_USER_PASSWORD = "select password from TicketBuyer where username = ?";

	public static final String INSERT_INTO_MOVIES = "insert into Movie values(?,?,?,?)";

	public static final String FETCH_MOVIE_LIST = "select distinct movie_name,release_date,genre,language,image_link,Movie.movie_id from Movie "
			+ "join MovieShow on Movie.movie_id=MovieShow.movie_id where MovieShow.show_id in "
			+ "(select show_id from MovieShow where show_date>now() and (available_FC_tickets>0 or available_SC_tickets>0))";

	public static final String FETCH_SHOWS_FOR_THIS_MOVIE = "select show_date,show_time,show_id from MovieShow where movie_id=? and show_date>now() and (available_FC_tickets>0 or available_SC_tickets>0)"; 

	public static final String FETCH_SHOWS_DETAILS = "select available_FC_tickets,available_SC_tickets,FC_ticket_rate,SC_ticket_rate,show_date,show_time from MovieShow where show_id=?";

	public static final String SELECT_USER_ID_FROM_NAME = "select user_id from TicketBuyer where username=?";
	
	public static final String INSERT_TICKETS = "insert into Ticket(show_id,user_id,ticket_class,number_of_tickets,ticket_amount) values(?,?,?,?,?)";

	public static final String UPDATE_FC_TICKET_COUNT = "update MovieShow set available_FC_tickets = available_FC_tickets-? where show_id=?";
	
	public static final String UPDATE_SC_TICKET_COUNT = "update MovieShow set available_SC_tickets = available_FC_tickets-? where show_id=?";

	public static final String GET_LAST_TICKET = "select ticket_id,show_id,ticket_class,number_of_tickets,ticket_amount from Ticket where user_id=? group by ticket_id desc limit 1";
	
	public static final String GET_TICKETS_OF_THIS_USER = "select ticket_id,show_id,ticket_class,number_of_tickets,ticket_amount from Ticket where user_id=? group by ticket_id desc";
	
	public static final String SELECT_SHOW_DETAILS_BY_ID = "select show_date,show_time from MovieShow where show_id=?";
	
	public static final String SELECT_MOVIE_NAME_BY_SHOWID = "select movie_name from Movie where movie_id = (select movie_id from MovieShow where show_id=?)";

	public static final String DISABLING_COMMIT = "set autocommit=0";

	public static final String SETTING_COMMIT = "set autocommit=1";

	
}
