import java.util.Scanner;
import static java.lang.Math.*;
public class Square {
	public int getArea(int a)
	{
		return a*a;
	}
	public int getPerimeter(int a)
	{
		return 4*a;
	}
	public double getDiagonal(int a)
	{
		return a*sqrt(2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		Square sq=new Square();
		int a;
		a=sc.nextInt();
		System.out.println("Area:"+sq.getArea(a));
		System.out.println("Perimeter:"+sq.getPerimeter(a));
		System.out.println("Diagonal:"+sq.getDiagonal(a));
		
			

	}

}
