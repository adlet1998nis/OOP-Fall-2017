package Task1;

public class Cylinder implements For3DShapes {
		public double radius;
		public double height;
		public Cylinder(double radius,double height)
		{
			this.radius=radius;
			this.height=height;
		}
		public double volume()
		{
			return For3DShapes.PI*this.radius*this.radius*this.height;
		}
		public double surfaceArea()
		{
			return 2.0*For3DShapes.PI*this.radius*(this.radius+this.height);
		}
}
