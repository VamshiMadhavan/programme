package com.technoelevate.tryresource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Try {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		try(Connection connection= DriverManager.getConnection(url, "root", "root");
				Statement statement =connection.createStatement();){
			boolean execute = statement.execute("insert into new values(6,'arya',21)");
			System.out.println(execute);
		}
		catch (Exception e) {
		}
		

	}

}
