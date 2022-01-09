package com.technoelevate.challenge;

public class Wall {
	double height;
	double width;

	Wall() {

	}

	public Wall(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}

	static double getHeight(double height) {
		if (height < 0) {
			return 0;
		}
		return height;
	}

	static double getWidth(double Width) {
		if (Width < 0) {
			return 0;
		}
		return Width;
	}

	double setHeight() {
		this.height = height;
		return height;
	}

	double setWidth() {
		this.width = width;
		return width;
	}

	double getArea() {
		return getHeight(height) * getWidth(width);
	}

	public static void main(String[] args) {
		Wall wall = new Wall(4, 6);
		System.out.println("the area of wall is "+wall.getArea());

	}

}
