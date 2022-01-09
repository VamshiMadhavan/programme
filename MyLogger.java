package com.technoelevtelogger;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {
	public static final Logger LOGGER = Logger.getLogger(MyLogger.class.getName());

	public static void main(String[] args) throws Exception, IOException {
//		ConsoleHandler consoleHandler = new ConsoleHandler();
//		consoleHandler.setLevel(Level.FINE);
//		LOGGER.addHandler(consoleHandler);
		FileHandler fileHandler = new FileHandler("C:\\Users\\Vamshi M\\Desktop\\logger\\log.log");
		MyFormtter myFormtter = new MyFormtter();
		fileHandler.setFormatter(myFormtter);
		LOGGER.addHandler(fileHandler);
		LOGGER.setLevel(Level.FINE);
		//LOGGER.setLevel(Level.FINE);
		LOGGER.finest("from finest");
		LOGGER.fine("from fine");
		LOGGER.config("from config");
		LOGGER.info("from info");
		LOGGER.severe("from severe");
		LOGGER.warning("from warning");
		LOGGER.finer("from finer");
		
		
		
	}

}
