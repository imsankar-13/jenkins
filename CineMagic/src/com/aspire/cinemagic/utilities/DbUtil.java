/*
 * @ClassName DbUtil
 * @Version 1.7
 * @Date 31-Dec-2016
 * @copyright 
 * 
 * This is the DB utility class for JDBC.
 */
package com.aspire.cinemagic.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// TODO: Auto-generated Javadoc
/**
 * The Class DbUtil for DB connection.
 */
public class DbUtil {

	/** The connection. */
	private static Connection connection = null;

	/**
	 * Gets the connection.
	 * 
	 * @return the connection
	 * @throws ClassNotFoundException
	 *             the class not found exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws SQLException
	 *             the sQL exception
	 */
	public static Connection getConnection() throws ClassNotFoundException,
			IOException, SQLException {
		
		Properties prop = new Properties();
		prop.load(new FileInputStream("/C:/Users/Dell/workspace/CineMagic/db.properties"));
		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String password = prop.getProperty("password");
		Class.forName(driver);
		connection = DriverManager.getConnection(url, user, password);

		return connection;
	}
}
