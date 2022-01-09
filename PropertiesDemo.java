package com.technoelevate.properties;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args)  {
		
		Connection connection = null;
		Statement statement = null;
		
		try {
			FileReader fileReader = new FileReader("C:\\Users\\Vamshi M\\Desktop\\dbcrediantial.txt");
			Properties properties = new Properties();
			properties.load(fileReader);
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice", properties);
			statement = connection.createStatement();
			statement.execute("insert into sweet values(501,'halwa',200)");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
