package com.technoelevate.addbatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Addbenchprac {
	public static void main(String[] args) {
		Connection connection=null;
	     Statement statement=null;
		String url="jdbc:mysql://localhost:3306/test";
		try {
			connection  = DriverManager.getConnection(url,"root", "root");
			statement  = connection.createStatement();
			statement.addBatch("insert into hello values(15,'karthi',29)");
			statement.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
