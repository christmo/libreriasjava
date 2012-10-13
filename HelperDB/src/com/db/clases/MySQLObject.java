package com.db.clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLObject extends DataBaseUnit {

//	private Statement st;
//	private Connection con;
//	private String driver;

	@Override
	public boolean openConnection() throws ClassNotFoundException, SQLException {
		System.out.println("Abrir conexion SQL");

		Class.forName("com.mysql.jdbc.Driver");

		// Define URL of database server for
		// database named mysql on the localhost
		// with the default port number 3306.
		String url = "jdbc:mysql://localhost:3306/mysql";

		// Get a connection to the database for a
		// user named root with a blank password.
		// This user is the default administrator
		// having full privileges to do anything.
		conexion = DriverManager.getConnection(url, "root", "");

		// Display URL and connection information
		System.out.println("URL: " + url);
		System.out.println("Connection: " + conexion);

		// Get a Statement object
//		st = con.createStatement();
		return true;
	}

	@Override
	public boolean closeConnection() throws SQLException {
		conexion.close();
		return true;
	}

}
