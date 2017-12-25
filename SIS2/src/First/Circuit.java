package First;

public abstract class Circuit {
	
	
	public abstract double getResistance();
	public abstract double getPotentialDiff();
	public abstract void applyPotentialDiff(double V);
	public double getPower()
	{
		return (getPotentialDiff()*getPotentialDiff())/(getResistance()*1.0);
	}
	public double getCurrent()
	{
		return getPotentialDiff()/(getResistance()*1.0);
	}
}
