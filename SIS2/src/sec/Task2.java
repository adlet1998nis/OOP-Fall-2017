package sec;

public class Task2 {

	public static void main(String[] args) {
		Bank bank=new Bank();
		Account a=new SavingsAccount(1,15);
		Account b=new CheckingAccount(2,5);
		a.deposit(1000);
		b.deposit(1500);
		b.transfer(200, a);
		bank.openAccount(a);
		bank.openAccount(b);
		bank.update();
		System.out.println(a.getBalance());
		System.out.println(b.getBalance());
		

	}

}
