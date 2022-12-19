package humanpractice;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		char grade = 'Z';
		System.out.print("당신의 성적을 입력하시오.");
		score = sc.nextInt();
		
		if(score >= 90) {
			grade = 'A';
		}
		else if(score >=80) {
			grade = 'B';
		}
		else if(score >=70) {
			grade = 'C';
		}
		else if(score >=60) {
			grade = 'D';
		}
		else if(score < 60) {
			grade = 'F';
		}
		System.out.printf("당신의 성적은 %d점이고, 등급은 %c입니다.", score, grade);

	}

}
