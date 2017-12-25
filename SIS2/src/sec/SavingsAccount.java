package sec;

public class SavingsAccount extends Account
{
	private double interestRate;
	public SavingsAccount(int accNumber, double interestRate) {
		super(accNumber);
		this.interestRate = interestRate;
	}
	public void addInterest() {
		this.deposit(((this.getBalance() * interestRate)/(100*1.0)));
	}
	public void update() {
		addInterest();
	}
}
