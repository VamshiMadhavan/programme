package com.technoelevate.addbatch;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class BatchStatement {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/new1";
		FileReader fileReader;
		Connection connection = null;
		Statement stmt = null;
		try {
			fileReader = new FileReader("C:\\Users\\Vamshi M\\Desktop\\dbcrediantial.txt");
			Properties properties = new Properties();
			properties.load(fileReader);
			connection = DriverManager.getConnection(url, properties);
			stmt = connection.createStatement();
			stmt.addBatch("insert into pushpa values(231,'allu arjun')");
		//	stmt.addBatch("update employees set name = ? where id = ?");
			stmt.addBatch("insert into pushpa values(112,'Rashmika')");
		//	stmt.addBatch("create table hi(id int primary key,name varchar(30))");
			stmt.executeBatch();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
