package sec;
import java.util.Vector;
public class Bank {
	Vector <Account> accounts=new Vector();
	public void openAccount(Account a) {
		accounts.addElement(a);
	}
	public void closeAccount(Account a) {
		accounts.remove(a);
	}
	public void update() {
		for (int i = 0; i < accounts.size(); i++) {
			accounts.get(i).update();
		}
	}
}
