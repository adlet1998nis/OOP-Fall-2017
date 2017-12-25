class Car
{
	public double efficiency;
	public double amount;
	public Car(double efficiency)
	{
		this.efficiency=efficiency;
		this.amount=0;
	}
	public double getGasInTank()
	{
		return this.amount ;
	}
	public void addGas(double _amount)
	{
		this.amount=this.amount+_amount;
	}
	public void drive(double distance)
	{
		this.amount=this.amount-(distance/(this.efficiency*1.0));
	}
}
public class CarTester {

	public static void main(String[] args) {
		Car car=new Car(15);
		car.addGas(100);
		car.drive(15);
		System.out.println(car.getGasInTank());
		

	}

}
