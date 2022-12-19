package humanpractice;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int stuNum = 0;
		int[] scores = null;
		double avg = 0.0;
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택 > ");
			
			int sel = sc.nextInt();
			
			if(sel ==1) {
				System.out.print("학생수 > ");
				stuNum = sc.nextInt();
				scores = new int[stuNum];
			}
			else if(sel ==2){
				for(int x=0; x<stuNum; x++) {
				System.out.printf("scores[%d] = ", x);
				scores[x] = sc.nextInt();
			}
		}
			else if(sel ==3) {
				for(int x=0; x<stuNum; x++) {
					System.out.printf("scores[%d] = %d\n", x, scores[x]);
				}
			}
			else if(sel==4) {
				int max = 0;
				int sum = 0;
				for(int x=0; x<stuNum; x++) {
					if(max < scores[x]) {
						max = scores[x];
						}
					sum = sum + scores[x];
					avg = (double)sum/stuNum;
				}
				System.out.printf("최고점수 : %d\n", max);
				System.out.printf("평균점수 : %4.1f\n", avg);
				
			}
			else if(sel==5) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
