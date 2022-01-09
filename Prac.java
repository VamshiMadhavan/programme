package com.technoelevate.transactionexp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Prac {

	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		String url="jdbc:mysql://localhost:3306/jdbcpractice";
		try {
			connection  = DriverManager.getConnection(url, "root", "root");
			statement  = connection.createStatement();
			statement.execute("insert into tranc values(1,'fingerprint')");
			statement.execute("insert into tranc values(2,'search number')");
			statement.execute("insert into tranc (3,'type money')");
			statement.execute("insert into tranc values(4,'send')");
			statement.execute("insert into tranc values(5,'sent')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
