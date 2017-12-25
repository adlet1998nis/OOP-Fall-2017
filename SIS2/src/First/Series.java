package First;

public class Series extends Circuit {
	
	Circuit a;
	Circuit b;
	public Series(Circuit a,Circuit b)
	{
		this.a=a;
		this.b=b;
	}
	public double getResistance()
	{
		return a.getResistance()+b.getResistance();
	}
	public void applyPotentialDiff(double pottentialDifference)
	{
		double I=pottentialDifference/getResistance();
		a.applyPotentialDiff(I*a.getResistance());
		b.applyPotentialDiff(I*b.getResistance());
		
	}
	public double getPotentialDiff()
	{
		return a.getPotentialDiff()+b.getPotentialDiff();
	}
	
	
	
}

