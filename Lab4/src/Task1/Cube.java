package Task1;

public class Cube implements For3DShapes {
	public double edge;
	public Cube(double edge)
	{
		this.edge=edge;
	}
	public double volume()
	{
		return this.edge*this.edge*this.edge;
	}
	public double surfaceArea()
	{
		return 6.0*this.edge*this.edge;
	}
}
