abstract class Shape {
	String color;
	public Shape(String color)
	{
		this.color = "red";
	}
	public abstract double area();
	public abstract String toString();
	public String getColor()
	{
		return color;
	}

	public static void main(String[] args) {
		
	}
}