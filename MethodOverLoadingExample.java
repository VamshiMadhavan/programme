package com.technoelevate.methodoverloading;

public class MethodOverLoadingExample extends Object{
	public void login()
	{
		
	}
	public static void login(String user,String pwd)
	{
		System.out.println("username is " + user + " & "+ "password is"+ " "+ pwd);
		
	}
	public  void login(long phonenumber, int otp )
	{
		System.out.println("phonenumber is " + phonenumber + " & "+ "otp is"+ " "+ otp);
	}
	public static void main(String[] args) {
		login("hiphop hementh","123456789");
		MethodOverLoadingExample m = new MethodOverLoadingExample();
		m.login(9876543210l, 4567);
}}
