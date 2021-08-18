package com.bridzelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfiguration {
	private static Connection connection = null;

	final String CONNECTION_URL = "jdbc:mysql://localhost:3306/payroll";
	final String user = "root";
	final String password = "root";

	private DBConfiguration() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(CONNECTION_URL, "root", "root");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnection() {

		return connection;
	}
}
