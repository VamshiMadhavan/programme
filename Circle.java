
 class Circle extends Shape {
	 int r;
	 Circle(int r,String color)
	 {
		 super(color);
		 this.r =r;
	 }
	public Circle(String color) {
		super(color);
	}
@Override
	public double area() {
		
		return Math.PI*r*r;
	}

	@Override
	public String toString() {
		return ("the color is "+super.getColor() + " "+ "the area is"+ area());
	}

}
