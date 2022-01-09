package com.technoelevate.tryresource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResource {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";

		try(Connection con =  DriverManager.getConnection(url,"root","root");
				Statement stmt = con.createStatement();){
			boolean execute = stmt.execute("insert into new values(7,'simbu',21)");
			System.out.println(execute);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
