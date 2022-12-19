package ex20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];

	private static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택 > ");

			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		System.out.print("계좌번호: ");
		String ano = sc.next();
		System.out.print("계좌주: ");
		String owner = sc.next();
		System.out.print("초기입금액: ");
		int balance = sc.nextInt();
		System.out.print("비밀번호: ");
		int password = sc.nextInt();
		
		int a = 0;
		
		Account ac = new Account(ano, owner, balance, password);
		
		for(a=0; a<accountArray.length; a++) {
			if(accountArray[a] == null) {
				accountArray[a] = ac;
				break;
			}
		}
		System.out.println("결과:계좌가 생성되었습니다.");
	}
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");
		for(int a=0; a<accountArray.length; a++) {
			if(accountArray[a] == null) {
				break;
			}
		System.out.printf("%s\t%s\t%d\n", accountArray[a].getAno(), accountArray[a].getOwner(), accountArray[a].getBalance());
		}
	}
	private static void deposit() {
		System.out.println("-------");
		System.out.println("예금");
		System.out.println("-------");
		System.out.print("계좌번호: ");
		String ano = sc.next();
		System.out.print("비밀번호: ");
		int password = sc.nextInt();
		Account ac = findAccount(ano, password);
		System.out.print("예금액: ");
		int deposit = sc.nextInt();
		int currentBalance = ac.getBalance();
		int nextBalance = currentBalance + deposit;
		ac.setBalance(nextBalance);
		System.out.println("예금이 성공되었습니다.");
		
		
		
	}
	private static void withdraw(){
		System.out.println("-------");
		System.out.println("출금");
		System.out.println("-------");
		System.out.print("계좌번호: ");
		String ano = sc.next();
		System.out.print("비밀번호: ");
		Account ac = findAccount(ano, password);
		System.out.print("출금액: ");
		int withdraw = sc.nextInt();
		int currentBalance = ac.getBalance();
		int nextBalance = currentBalance - withdraw;
		ac.setBalance(nextBalance);
		System.out.println("출금이 성공되었습니다.");
	}
	private static Account findAccount(String ano, int password) {
		int a = 0;
				for(a=0; a<accountArray.length; a++) {
					if(ano.equals(accountArrbay[a].getAno()) && password.equals(accountArray[a].getPassword())) {
						break;
					}
				}
				return accountArray[a];
	}
}