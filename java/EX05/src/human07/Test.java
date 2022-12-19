package human07;

public class Test {
	// 멤버변수 없음.
	// 생성자는 생략. Test() 이러한 생성자가 생략.
	
	public void test(String strA, String strB) throws NumberFormatException {
		// 아래와 같이 예외처리 할 수 있으나.
		// throws를 사용하여 호출한 쪽에서 에러처리 할 수 있도록 함.
	
//		try {
//		int strIntA = Integer.parseInt(strA);
//		int strIntB = Integer.parseInt(strB);
//		
//		int intValue = strIntA + strIntB;
//		
//		System.out.printf("intValue : %d \n", intValue);
//		}
//		catch(NumberFormatException ne) {
//			ne.printStackTrace();
//	}
		
		int strIntA = Integer.parseInt(strA);
		int strIntB = Integer.parseInt(strB);
		
		int intValue = strIntA + strIntB;
		
		System.out.printf("intValue : %d \n", intValue);
	}

}
