package sec;

public class CheckingAccount extends Account
{
	private int numTransactions;
	private int freeTransactions;
	public final double commission = 0.02;
	public CheckingAccount(int accNumber, int freeTransactions) {
		super(accNumber);
		this.freeTransactions = freeTransactions;
	}
	public void transfer(double amount, Account other) {
		super.transfer(amount, other);
		numTransactions++;
	}
	public void deductFee() {
		int val = numTransactions-freeTransactions;
		if(val<0)
		{
			val=0;
		}	
		this.withdraw(commission * val);
	}
	public void update() {
		deductFee();
	}
}
