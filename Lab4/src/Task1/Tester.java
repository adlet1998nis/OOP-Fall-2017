package Task1;

public class Tester {

	public static void main(String[] args) {
		Cylinder cylinder=new Cylinder(4,5);
		Sphere sphere=new Sphere(3);
		Cube cube=new Cube(4);
		System.out.println(cylinder.volume()+" "+cylinder.surfaceArea());
		System.out.println(sphere.volume()+" "+sphere.surfaceArea());
		System.out.println(cube.volume()+" "+cube.surfaceArea());
				
			

	}

}
