package human15;

public class StringToLowerToUpperExam {

	public static void main(String[] args) {
		String str1 = "java Programing";
		String str2 = "JAVA Programing";
		
		System.out.println(str1.equals(str2));
		// 문자열은 대소문자를 구분하기 때문에 결과는 false.
		
		// 대소문자를 가리지 않는 문자열 비교함수 : equalsIgnoreCase
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String lowerStr1 = str1.toLowerCase(); // java programing
		String lowerStr2 = str2.toLowerCase(); // java programing
		
		System.out.println(lowerStr1);
		System.out.println(lowerStr2);
		System.out.println(lowerStr1.equals(lowerStr2));	// true
		
		String UpperStr1 = str1.toUpperCase(); // java programing
		String UpperStr2 = str2.toUpperCase(); // java programing
		
		System.out.println(UpperStr1);
		System.out.println(UpperStr2);
		System.out.println(UpperStr1.equals(UpperStr2));	// true

	}

}
