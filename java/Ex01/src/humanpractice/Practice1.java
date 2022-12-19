package humanpractice;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String add;
		System.out.print("당신의 주소를 입력하세요.");
		add = sc.nextLine();
		System.out.printf("당신의 주소는 %s입니다.\n", add);
		
		int answer;
		int answer1 = 2;
		System.out.print("다음중 답으로 옳은 것을 고르시오.\n");
		System.out.print("1. 1+1 = 1 \n2. 1+1 = 2 \n3. 1+1 = 3 \n4. 1+1 = 4");
		answer = sc.nextInt();
		
		if(answer == answer1) {
			System.out.println("답이 맞습니다.");
		} else {
			System.out.print("답이 틀립니다.");
		}
		sc.close();
		
	}
}
