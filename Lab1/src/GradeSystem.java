import java.util.Scanner;
public class GradeSystem {
	public void identifyGrade(int gr)
	{
		if(gr>=95 && gr<=100)
		{
			System.out.println("A");
		}
		else if(gr<=94 && gr>=90)
		{
			System.out.println("A-");
		}
		else if (gr>=85 && gr<=89)
		{
			System.out.println("B+");
		}
		else if (gr>=80 && gr<=84)
		{
			System.out.println("B");
		}
		else if (gr>=75 && gr<=79)
		{
			System.out.println("B-");
		}
		else if (gr>=70 && gr<=74)
		{
			System.out.println("C+");
		}
		else if(gr>=65 && gr<=69)
		{
			System.out.println("C");
		}
		else if(gr>=60 && gr<=64)
		{
			System.out.println("C-");
		}
		else if(gr>=55 && gr<=59)
		{
			System.out.println("D+");
		}
		else if(gr>=50 && gr<=54)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");

		}
		
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		GradeSystem grad=new GradeSystem();
		int num;
		num=sc.nextInt();
		grad.identifyGrade(num);
		
	}

}
