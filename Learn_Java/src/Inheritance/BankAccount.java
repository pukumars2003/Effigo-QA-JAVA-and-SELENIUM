package Inheritance;

public class BankAccount {
	private double amt;
	private String accountNumber;
	private double balance;
	
	public BankAccount(String accountnumber, double balance) {
		this.accountNumber=accountnumber;
		this.balance=balance;
	}
	public void deposit(double amt) {
		balance+=amt;
	}
	
	public void withdraw(double amt) {
		if(balance>=amt) {
			balance-=amt;
		}
		else {
			System.out.println("No balance");
		}
	}
	public double getBalance() {
		return balance;
	}
	
}
