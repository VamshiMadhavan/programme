package com.technoelevate.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatements {

  
	public static void main(String[] args) {
		  Connection conn = null;
		PreparedStatement statements = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "@Vamshi555");
			conn.prepareStatement("insert into sweets values (?,?,?)");
			Scanner sc = new Scanner(System.in);
			
			statements.setInt(1, 102);
			statements.setString(2, "rasagula");
			statements.setDouble(3, 35);
			int executeupdate = statements.executeUpdate();
			System.out.println(executeupdate);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (statements != null) {
					statements.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}

}
