package com.technoelevate.transactionexp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		Connection c = null;
		Statement s = null;
		Savepoint s1 = null;

		String url = "jdbc:mysql://localhost:3306/jdbcpractice";

		try {
			c = DriverManager.getConnection(url, "root", "root");
			s = c.createStatement();
		//	c.setAutoCommit(false);
			s.execute("insert into tranc values(1,'unlock the app')");
			s.execute("insert into tranc values(2,'Entered the pin')");
			s.execute("insert into tranc values(3,'check balance')");

			//s1 = c.setSavepoint();

			s.execute("insert into tranc (4,'Debiting amount')");
			s.execute("insert into tranc values(5,'transfer through network')");
			s.execute("insert into tranc values(6,'crediting amount')");
			c.commit();

		} catch (SQLException e) {
			/*if (s1 != null) {
				try {
				c.rollback(s1);
					c.commit();
					System.out.println("transaction failed");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}*/

		}

	}

}
