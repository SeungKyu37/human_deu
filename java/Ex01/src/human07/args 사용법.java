package human07;

public class HumanExam07 {

	public static void main(String[] args) {
		// args 사용방법.
		
		System.out.printf("args[0] = %s \n", args[0]);
		System.out.printf("args[1] = %s \n", args[1]);
		
		int z = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		
		System.out.println(z);

	}
}
