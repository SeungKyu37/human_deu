package human05;

public class HumanExam09_2 {
	public static void main(String[] args) {
		/*
 		*****
 		****
 		***
 		**
 		*
 */
		for(int a=1; a <= 5; a++) {
			for(int b=1; b <=5+1-a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
