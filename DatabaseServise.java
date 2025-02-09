package com.hospital_project2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseServise {
	public static Connection conn;
	private static Connection createConn() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitals?user=root&password=Mysql@123");
		System.out.println("Database connection created successfully.");
		return conn;
	}
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if (conn == null) {
			return createConn();
		}
		return conn;
	}

}

