package ex19;

public class Account {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	private int balance;		//계좌잔고		0<=balance<=1,000,000
	
	public Account() {
		this.balance = 0;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void setBalance(int bal) {
		if(bal >= MIN_BALANCE && bal <= MAX_BALANCE ) {
			this.balance = bal;
		}
	}
}
	
	
