package com.technoelevate.addbatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new1","root", "root");
			 statement  = connection.createStatement();
			 statement.addBatch("insert into pushpa values(1,'Allu Arjun')");
			 statement.addBatch("insert into pushpa values(2,'Rashmika')");
			 statement.addBatch("insert into pushpa values(3,'Samantha')");
			 statement.addBatch("insert into pushpa values(4,'Fahad Fasil')");
			 statement.addBatch("insert into pushpa values(5,'Dhananjiya')");
			 statement.executeBatch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
