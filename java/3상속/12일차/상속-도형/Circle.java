package area;

public class Circle extends Shape{
	double r;
	
	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double CalcArea() {
		double area;
		area = Math.PI*r*r;
		return area;
		
		
	}
	
}
