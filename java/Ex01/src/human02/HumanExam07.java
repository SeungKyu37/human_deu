package human02;

import java.util.Scanner;

public class HumanExam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.print("당신의 성적을 입력하세요.");
		score = sc.nextInt();
		char grade = (score>=90) ? 'A' : 'B' ;
		
		System.out.printf("score = %d, grade = %c \n", score, grade);
		
	}

}
