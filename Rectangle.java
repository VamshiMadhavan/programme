public class Rectangle extends Shape {
	int l;
	int b;
	public Rectangle(String color, int l,int b) {
		super(color);
		this.l = l;
		this.b = b;
		
	}
	@Override
	public double area() {
		return l*b;
	}
	@Override
	public String toString() {
		return ("the area is"+ area()+"the color is "+ super.getColor());
	}
	
	

}
