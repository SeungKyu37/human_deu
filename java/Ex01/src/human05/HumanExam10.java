package human05;

import java.util.Scanner;

public class HumanExam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;		// 반복 조건. 만약 사용자가 4를 선택하면 종료.
								
		int balance = 0;		// 현재 내가 가지고 있는 잔고.
		int a;
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.println("선택 > ");
			a = sc.nextInt();
			if (a==1) {
				System.out.println("예금액 > ");
				int b = sc.nextInt();
				balance = balance + b;
				 
			}
			if (a==2) {
				System.out.println("출금액 > ");
				balance = balance - sc.nextInt();
				}
			if (a==3) {
				System.out.printf("잔고 > %d\n", balance);
				}
			if (a==4) {
				System.out.println("프로그램 종료");
				break;
			}
			}
		sc.close();
		}
	
		
	}

