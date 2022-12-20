package area;

public class Rectangle extends Shape{
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double CalcArea() {
		double area;
		area = this.width*this.height;
		return area;
		
	}
	

}
