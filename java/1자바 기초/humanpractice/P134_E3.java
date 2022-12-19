package humanpractice;

public class P134_E3 {

	public static void main(String[] args) {
		int total = 0;
		int index;
		for (index=0; index<=100; index=index +1) {
			if(index%3 ==0) {
				total = total + index;
			}
		}
		System.out.printf("3의 배수의 합 : %d", total);
	}

}
 