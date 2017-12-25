package Task2;

public class TheUsageOfAbst {
	abstract class ShapesWithRadius
	{	
		final static double PI=3.14159;
		public double radius;
		public abstract double volume();
		public abstract double surfaceArea();
	}
	class Cylinder extends ShapesWithRadius
	{
		
		public double height;
		public Cylinder(double radius,double height)
		{
			this.radius=radius;
			this.height=height;
		}
		public double volume()
		{
			return ShapesWithRadius.PI*this.radius*this.radius*this.height;
		}
		public double surfaceArea()
		{
			return 2*ShapesWithRadius.PI*this.radius*this.radius+2*ShapesWithRadius.PI*this.radius*this.height;
		}
	}
	class Sphere extends ShapesWithRadius
	{
		public Sphere(double radius)
		{
			this.radius=radius;
		}
		public double volume()
		{
			return (4*ShapesWithRadius.PI*this.radius*this.radius*this.radius)/3.0;
		}
		public double surfaceArea()
		{
			return 4*ShapesWithRadius.PI*this.radius*this.radius;
		}
	}
}
