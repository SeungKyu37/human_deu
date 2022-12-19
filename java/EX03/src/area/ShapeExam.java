package area;

public class ShapeExam {

	public static void main(String[] args) {
		Shape circle = new Circle(25.0);
		System.out.printf("%f\n", circle.CalcArea());
		
		Shape rect = new Rectangle(10,5);
		System.out.printf("%2.0f", rect.CalcArea());
	}

}
