package Task1;

public class Sphere implements For3DShapes {
	public double radius;
	public Sphere(double radius)
	{
		this.radius=radius;
	}
	public double volume()
	{
		return (4*For3DShapes.PI*this.radius*this.radius*this.radius)/3.0;
	}
	public double surfaceArea()
	{
		return 4.0*For3DShapes.PI*this.radius*this.radius;
	}
}
