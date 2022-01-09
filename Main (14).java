package com.technoelevate.jdbcproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main implements MultiPlayer {
	String url = "jdbc:mysql://localhost:3306/multiplayer";
	Scanner sc = new Scanner(System.in);
	public static final Logger LOGGER = Logger.getLogger(Main.class.getName());
	
	@Override
	public void delete() {
		Connection connection = null;
		PreparedStatement statement = null;
		 try {
			connection = DriverManager.getConnection(url, "root","@Vamshi555");
			statement =connection.prepareStatement("delete from songs where songName=?");
			LOGGER.info("enter the songname that u want to delete:");
			String songName = sc.next();
			statement.setString(1, songName);
			statement.executeUpdate();
			LOGGER.info("song successfully deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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

	
	@Override
	public void update() {
		Connection connection = null;
		PreparedStatement statement = null;
		
		try {
			connection = DriverManager.getConnection(url, "root", "@Vamshi555");
			statement = connection.prepareStatement("update songs set songName=? where songName=?");
			LOGGER.info("enter the song to change:");
			String currentsong = sc.next();
			statement.setString(2, currentsong);
			LOGGER.info("enter the new song:");
			String newsong = sc.next();
			statement.setString(1, newsong);
			statement.executeUpdate();
			LOGGER.info("song successfully uptaded");		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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
	
	@Override
	public boolean search() {
		boolean result = false;
		Connection connection = null;
		PreparedStatement statement=null;
		try {
			connection =DriverManager.getConnection(url, "root","@Vamshi555");
			connection.prepareStatement("select songName from songs where songName=?");
			LOGGER.info("Enter the song name:");
			String song = sc.next();
			statement.setString(1, song);
			ResultSet result2 = statement.executeQuery();
			while(result2.next()) {
				System.out.println("U'r song is there->"+result2.getString(1));
				result=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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
		
		return result;
	}
	
	@Override
	public boolean play() {
		boolean result = false;
		Connection connection = null;
		PreparedStatement statement = null;
		
		try {
			connection = DriverManager.getConnection(url, "root", "@Vamshi555");
			statement =connection.prepareStatement("select songName from songs where songName=?");
			LOGGER.info("Enter the song name:");
			String songName = sc.next();
			
			statement.setString(1, songName);
			ResultSet result1 = statement.executeQuery();
			while(result1.next()){
				System.out.println(result1.getString(1)+".................");
				result=true;
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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
		
		
		return result;
	}

	
	public void playList() {
		Connection connection=null;
		Statement statement = null;
		
		try {
			connection=DriverManager.getConnection(url, "root", "@Vamshi555");
			statement =connection.createStatement();
			ResultSet result = statement.executeQuery("select * from songs");
			while(result.next()) {
				System.out.println(result.getInt(1)+"=>"+result.getString(2)+"=>"+result.getString(3));
			}
		} catch (SQLException e) {
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


	@Override
	public void add() {

		Connection connection = null;
		PreparedStatement statements = null;
		try {
			while(true) {
				connection = DriverManager.getConnection(url, "root", "@Vamshi555");
				statements = connection.prepareStatement("insert into songs values(?,?,?)");
				
				LOGGER.info("enter the song number:");
				int number = sc.nextInt();
				if(number==0) {
					break;
				}
				statements.setInt(1, number);
				LOGGER.info("enter the song name:");
				String name = sc.next();
				statements.setString(2, name);
				LOGGER.info("enter the song duration:");
				String duration = sc.next();
				statements.setString(3, duration);
				int update = statements.executeUpdate();
				System.out.println(update);
			}
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
				if (statements != null) {
					statements.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	
	


	


	

	

	

}
