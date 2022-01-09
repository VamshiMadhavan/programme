package com.technoelevate.jdbcproject;

import java.util.Scanner;
import java.util.logging.Logger;

public class User {
	public static final Logger LOGGER = Logger.getLogger(User.class.getName());

	public static void main(String[] args) {
		Main main = new Main();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the option:");
		String option =sc.next();
		switch(option) {
		
		case "add":{
			main.add();
			break;
		}
		
		case "playlist":{
			main.playList();
			break;
		}
		
		case "play":{
			main.play();
         if(!main.play()) {
        	 LOGGER.info("Result Not Found");
         }
         break;
		}
		
		case "search":{
			main.search();
			if(!main.search()) {
				LOGGER.info("Song Not Found");
			}
			break;
		}
		
		case "update":{
			main.update();
			break;
		}
		
		case "delete":{
			main.delete();
			break;
		}
		
		case "exit":{
			LOGGER.info("Thank You");
			break;
		}
		
		
		}
	}

}
