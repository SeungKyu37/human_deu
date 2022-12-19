import java.util.ArrayList;
import java.util.Scanner;

public class Order {
	private ArrayList<String> alName;
	private ArrayList<Integer> alQty;
	private ArrayList<Integer> alPrice;	// 합계 (단가X수량)
	private String mobile;
	private Menu m1;
	
	Order(Menu m){
		// 초기화
		this.alName = new ArrayList<String>();
		this.alQty = new ArrayList<Integer>();
		this.alPrice = new ArrayList<Integer>();
		this.mobile = new String();
		this.m1 = m;
	}
	void add() {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		while(true) {
			this.m1.display();
			// 메뉴 번호를 입력받는다 (""이 아닌 동안)
			System.out.print("메뉴번호를 입력하시오['':종료]");
			String pMenuNum = s1.nextLine();
			if(pMenuNum.equals("")) break;
			
			int index = Integer.parseInt(pMenuNum)-1;	// 메뉴번호->메뉴인덱스로 변환
			String name = this.m1.getName(index);
			int net = this.m1.getPrice(index);
			System.out.println("수량을 입력하시오:");	// 수량을 입력받는다
			int qty = s2.nextInt();
		
			// alName/alQty/alPrice에 각각 추가
			this.alName.add(name);
			this.alQty.add(qty);
			this.alPrice.add(qty*net); // 단가*수량 => 합계를 계산
		}
		System.out.print("모바일번호를 입력하시오");
		this.mobile = s1.nextLine();			// 모바일 번호 입력받는다.
		// Sales 객체에 Order 객체의 내용을 복사
		// alMobile=this.mobile
		// alMenu=this.alName
		// alQty = this.alQty
		// alPrice = this.alPrice
		// alTime = new Date()
	}
		
	void display() {
		// 주문 내역을 출력(화면표시)
		int sum=0;
		for(int i=0; i<this.alName.size(); i++) {
			System.out.println((i+1)+"."+this.alName.get(i) + ", x" + this.alQty.get(i) + ", " + this.alPrice.get(i) +"원");
			sum+=this.alPrice.get(i);
		}
		System.out.println("총액:"+sum+", 모바일번호"+this.mobile);
	}
	void delete() {
		// 취소할 주문번호를 입력받는다. (""이 아닌 동안)
		// 주문 삭제.
		Scanner s1 = new Scanner(System.in);
		
		while(true) {
			this.m1.display();
			System.out.print("지울 주문내역번호를 입력하시오['':종료]");
			String pMenuNum = s1.nextLine();
			if(pMenuNum.equals("")) break;
			
			int index = Integer.parseInt(pMenuNum)-1;
			this.alName.remove(index);
			this.alPrice.remove(index);
			this.alQty.remove(index);
			}
	}
	void control() {
		Scanner s1 = new Scanner(System.in);	// 문자열 입력전용
		Scanner s2 = new Scanner(System.in);	// 숫자 입력전용
		
		while(true) {
			System.out.print("메뉴작업을 선택하시오 [c:메뉴추가, r:메뉴목록표시, d:메뉴삭제, '': 프로그램 종료]:");
			String instr = s1.nextLine();
			if(instr.equals("")) {
				// while exit, program terminated.
				break;
			} else if(instr.equals("c")) {
				this.add();
			} else if(instr.equals("r")) {
				this.display();
			} else if(instr.equals("d")) {
				this.delete();
			} 
	}
	}
	int getSize() {
		return this.alName.size();
	}
	String getName(int index) {
		return this.alName.get(index);
	}
	int getQty(int index) {
		return this.alQty.get(index);
	}
	int getPrice(int index) {
		return this.alPrice.get(index);
	}
	String getMobile() {
		return this.mobile;
	}
}
