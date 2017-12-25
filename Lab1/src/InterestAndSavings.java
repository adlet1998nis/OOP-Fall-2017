public class InterestAndSavings {

	public int interest_rate=50;
	public int amount_of_saving=1000;
	public double getNewBalance()
	{
		return (((interest_rate/100.0)*(amount_of_saving))+amount_of_saving);
	}
	public static void main(String[] args) {
		InterestAndSavings ias=new InterestAndSavings();
		System.out.print(ias.getNewBalance());

	}

}
