package com.technoelevate.crud;
import com.mysql.jdbc.Driver;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		
		Connection connection = null;
		Statement createStatement = null;
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=@Vamshi555");
			 createStatement = connection.createStatement();
			createStatement.execute("create table sweet(id int primary key,name varchar(40),cost double)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(createStatement != null) {
				createStatement.close();}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

}}
