package First;

public class Resistor extends Circuit {
	private double pottentialDifference;
	double r;
	public Resistor(double resistance)
	{
		this.r=resistance;
	}
	public double getResistance()
	{
		return this.r;
	}
	public void applyPotentialDiff(double pottentialDifference)
	{
		this.pottentialDifference=pottentialDifference;
	}
	public double getPotentialDiff()
	{
		return this.pottentialDifference;
	}
	
	
}
