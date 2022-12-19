package human04.PackageA;

public class B {
	public static void main(String[] args) {
		A a = new A();	// 동일 PKG이므로 가능
		a.field = 1; 	// 동일 PKG이므로 가능
		a.method(); 	// 동일 PKG이므로 가능			
	}
	

}
