import java.util.Scanner;
import static java.lang.Math.*;
public class QuadraticEquation {
	public void showAnswer(int a,int b,int c)
	{
		if(a==0 && b==0)
		{
			if(c==0)
			{
					System.out.println("The equation has has an infinite set of solutions");
					System.exit(0);
			}
			else
			{
				System.out.println("The equation doesn't have solutions.");
				System.exit(0);
			}
		}
		if(a==0)
		{
			System.out.println(-c/(b*1.0));
			System.exit(0);
		}
		int D;
		D=(int)pow(b,2)-4*a*c;
		if(D>0)
		{
			System.out.println((-b+(double)sqrt(D))/2*a);
			System.out.println((-b-(double)sqrt(D))/2*a);
		}
		else if(D==0)
		{
			System.out.println(-b/((2*a)*1.0));
		}
		else 
		{
			System.out.println("The equation doesn't have answers");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		QuadraticEquation  qe=new QuadraticEquation ();
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		qe.showAnswer(a, b, c);
		
		
		
	}

}
