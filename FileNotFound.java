package com.technoelevate.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {

	public static void main(String[] args) {
		try {
			FileReader f = new FileReader("‪C:\\Users\\Vamshi M\\Desktop\\javaprojects\\filenotfound.txt.tx");
		} catch (FileNotFoundException e) {
			System.out.println("filenotfound");
		}
	}

}
