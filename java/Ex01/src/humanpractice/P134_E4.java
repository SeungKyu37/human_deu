package humanpractice;

public class P134_E4 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		int num2 = (int)(Math.random()*6) + 1;
		int total = num + num2;
		
		while (num <= 6) {
			while(num2 <=6) {
			if(total ==5) {
				break;
			}
		}
		System.out.printf("(%d,%d)\n", num, num2);
		}
	}
}
