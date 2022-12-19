package humanpractice;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k;
		int e;
		int m;
		int s;
		System.out.print("국어 점수를 입력하시오\n");
		k = sc.nextInt();
		System.out.print("영어 점수를 입력하시오\n");
		e = sc.nextInt();
		System.out.print("수학 점수를 입력하시오\n");
		m = sc.nextInt();
		System.out.print("과학 점수를 입력하시오\n");
		s = sc.nextInt();
		System.out.printf("이번 시험 평균은 %d점입니다.", ( k + e + m + s)/4);
		}
}
