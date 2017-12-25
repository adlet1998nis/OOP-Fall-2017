package sec;

public class Account {
	private double balance;
	private int accNumber;
	public Account(int a) {
		balance = 0.0;
	    accNumber = a;
	}
	public void deposit(double sum) {
		balance += sum;
	}
	public void withdraw(double sum) {
		balance -= sum;
	}
	public double getBalance() {
		return balance;
	}
	public int getAccountNumber() {
		return accNumber;
	}
	public void transfer(double amount, Account other) {
		
		other.deposit(amount);
		withdraw(amount);
	}
	public String toString() {
		return "Account number: " + accNumber + ", balance: " + balance;
	}
	public final void print() {
		System.out.println( toString() ); 
	}
	public void update() {
		
	}
}
