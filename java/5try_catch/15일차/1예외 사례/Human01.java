package human01;

public class Human01 {
	
	public static void main(String[] args) {
		// nullpointeException 사례
		Human h01 = new Human("KANG");
		h01.run();
		System.out.println(h01);
		
		h01 = null;
		System.out.println(h01);

//		h01.run();
		
		// 2. 배열변수에 null로 초기화한 후 배열 내의 값을 접근할 경우.
		int[] intValue = null;
		System.out.printf("intValue[0] = %d\n", intValue[0]);
		
	}
}
