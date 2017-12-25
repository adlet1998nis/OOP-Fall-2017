package First;

public class Parallel extends Circuit {
	
	Circuit a;
	Circuit b;
		
	public Parallel(Circuit a,Circuit b)
	{
		this.a=a;
		this.b=b;
	}
	public double getResistance()
	{
		return (a.getResistance()*b.getResistance())/(a.getResistance()+b.getResistance());
	}
	public void applyPotentialDiff(double pottentialDifference)
	{
		a.applyPotentialDiff(pottentialDifference);
		b.applyPotentialDiff(pottentialDifference);
		
	}
	public double getPotentialDiff()
	{
		return a.getPotentialDiff();
	}
}
