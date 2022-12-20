package Human09;

public class MyPointExam {

	public static void main(String[] args) {
//		System.out.println(Math.sqrt(4));	// 2.0*2.0 == 4
//		System.out.println(Math.sqrt(9));	// 3.0*3.0 ==9
		MyPoint p = new MyPoint(1,1);
		
		double dis = p.getDistance(1, 5);
		
		System.out.printf("두 점 사이의 거리는 = %f\n", dis);
		
	}

}
