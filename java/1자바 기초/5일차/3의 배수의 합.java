package human05;

public class HumanExam06 {

	public static void main(String[] args) {
		int a;
		int total = 0;
/*		for(a=1; a<=100; a++) {
			if(a%3==0) {
				total = total + a;
				System.out.printf("%d까지의 누적합 : %d\n", a, total);
			}
		}
		*/
		for(a=0; a<=100; a+=3) {
			if(a%3==0) {
				total = total + a;
				System.out.printf("%d까지의 누적합 : %d\n", a, total);
			}
		}
		System.out.printf("3의 배수의 합 : %d\n", total);
	}

}
