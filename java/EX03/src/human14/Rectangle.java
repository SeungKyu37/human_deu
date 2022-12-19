package human14;

public class Rectangle extends Shape{
	private double width;
	private double height;
	
	public Rectangle (double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calcArea() {
		double area;
		area = this.width*this.height;
		return area;
	}
}
