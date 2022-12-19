package ex20;

public class Account {
	private String ano;
	private String owner;
	private int balance;
	private int password;
	
	public Account(String ano, String owner, int balance, int password) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.password = password;
		}
	
	public String getAno() {
		return ano;			// this.ano
		}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;		// this.owner
	}
	public void setOwner(String owner) { 
		this.owner = owner;
	}
	public int getBalance() {
		return balance;		// this.balance
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPassword() {
		return password;		
	}
	public void setPassword(int password) {
		this.password = password;
	}
}

