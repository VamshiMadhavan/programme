package com.technoelevate.tryresource;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StorePro {

	public static void main(String[] args) {
		Connection connection=null;
		CallableStatement statement=null;
		String url= "jdbc:mysql://localhost:3306/jdbcdemo";
		 
		
		try {
			connection  = DriverManager.getConnection(url, "root", "root");
		    statement  =  connection.prepareCall("call push(?,?,?)");
		    statement.setInt(1, 12);
		    statement.setString(2,"vishal" );
		    statement.setInt(3, 29);
		    boolean execute = statement.execute();
		    System.out.println(execute);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
