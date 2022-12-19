package human07;

import java.util.Scanner;

public class HumanExam09 {

	public static void main(String[] args) {
		// 전역변수
		boolean run = true;
		int stuNum = 0;
		int[] scores = null;
		
		int max = 0;
		int sum = 0;
		double avg = 0.0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택 > ");
			
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.print("학생수 > ");
				stuNum = sc.nextInt();
				scores = new int[stuNum];
			}else if(sel == 2) {
				for(int a =0; a<stuNum; a++) {
					System.out.printf("scores[%d]> ", a );
					scores[a]=sc.nextInt();
					}		
			}else if(sel == 3) {
				for(int d= 0; d<stuNum; d++) {
				System.out.printf("socres[%d]: %d\n", d, scores[d]);
				}
			}else if(sel == 4) {
				int min = 100;
				for(int b = 0; b<stuNum; b++) {
					if(max<scores[b]) {
						max=scores[b];
					}
					if(min >scores[b]) {
						min=scores[b];
					}
						sum = sum + scores[b];
						avg = (double)sum/stuNum;
					}
				System.out.printf("최고 점수 : %d\n", max);
				System.out.printf("최하 점수 : %d\n", min);
				System.out.printf("평균 점수 : %4.1f\n", avg);
			}else if(sel == 5) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		sc.close();

}
}
