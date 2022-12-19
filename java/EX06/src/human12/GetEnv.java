package human12;

public class GetEnv {

	public static void main(String[] args) {
		String javaHome = System.getenv("Path");
		System.out.println(javaHome);
	}

}
