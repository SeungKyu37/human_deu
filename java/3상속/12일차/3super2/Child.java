package human02_1;

public class Child extends Parent{
	public Child() {
		super(); 
		// super는 생성자 생성시 절대적으로 있어야 함.
		// super는 생략가능하다. (단, 인자가 없을때만)
		// 코드상에서만 생략이지, 컴파일하면 자동을 만들어냄.
		System.out.println("Child() 생성");
	}
	public Child(int i) {
		super(i);
		//인자가 있는 부모의 생성자를 호출시에는 생략불가
		System.out.println("Child(i) 생성");
	}
}
