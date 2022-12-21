package human07;

public class ProductExam {

	public static void main(String[] args) {
		Tv t1 = new Tv("삼성", "Galaxy Tv", 300, true);
		Tv t2 = new Tv("LG", "G6 Tv", 200, false);
		
		Car c1 = new Car("현대", "G70", 300);
		Car c2 = new Car("기아", "스포티지", 250);
		
		Product<Tv, String> prod1 = new Product<Tv, String>(t1, "smart TV");
		System.out.println("t1.company ==> " + t1.company);
		System.out.println("t1.name ==> " + t1.name);
		System.out.println("t1.maxChannel ==> " + t1.maxChannel);
		System.out.println("t1.isVoiceRecog ==> " + t1.isVoiceRecog);
		System.out.println("prod1.mode1 ==> " + prod1.model);
		System.out.println();
		
		Product<Tv, String> prod2 = new Product<Tv, String>(t2, "OLED TV");
		System.out.println("t2.company ==> " + t2.company);
		System.out.println("t2.name ==> " + t2.name);
		System.out.println("t2.maxChannel ==> " + t2.maxChannel);
		System.out.println("t2.isVoiceRecog ==> " + t2.isVoiceRecog);
		System.out.println("prod2.mode1 ==> " + prod2.model);
		System.out.println();
		
		Product<Car, String> prod3 = new Product<Car, String>(c1, "세단");
		System.out.println("c1.company ==> " + c1.company);
		System.out.println("c1.name ==> " + c1.name);
		System.out.println("c1.maxSpeed ==> " + c1.maxSpeed);
		System.out.println("prod3.mode1 ==> " + prod3.model);
		System.out.println();
		
		Product<Car, String> prod4 = new Product<Car, String>(c2, "SUV");
		System.out.println("c2.company ==> " + c2.company);
		System.out.println("c2.name ==> " + c2.name);
		System.out.println("c2.maxSpeed ==> " + c2.maxSpeed);
		System.out.println("prod4.mode1 ==> " + prod4.model);
	}

}
