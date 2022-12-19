package human04.PackageA;

public class A {
	public int field1;
	int filed2;
	private int field3;
	protected int field;
	protected A() {
		System.out.println("A 클래스의 생성자 생성");
	}
	@Override
	protected void method() {
		System.out.println("A 클래스의 메서드 실행");
	}
	public static void main(String[] args) {
		A a = new A();
		a.field = 1;
		a.method();
		//나 자신이므로 protected 모두 접근 가능.
	}
}
