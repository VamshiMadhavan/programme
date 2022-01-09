package com.technoelevate.tryresource;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;


public class Connectionpractice {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		Connection con = null;
		CallableStatement stmt = null;
		try {
			 con = DriverManager.getConnection(url, "root", "root");
			  stmt = con.prepareCall("call push(?,?,?)" );
			 
			 Scanner sc = new Scanner(System.in);
			 while(true) {
				 
				 //giving input
				 int id = sc.nextInt();
				 if(id == 0) {
					 break;
				 }
				
				 String name = sc.next();
				 int age = sc.nextInt();
				 //assigning value
				 stmt.setInt(1, id);
				 stmt.setString(2, name);
				 stmt.setDouble(3, age);
				 
				 //executing
				 stmt.execute();
				 System.out.println("-----------------");
			 }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}


