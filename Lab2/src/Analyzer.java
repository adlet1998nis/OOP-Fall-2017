import java.util.Scanner;
class Data
{
	private int counter;
	private double max;
	private double average;
	public Data()
	{
		counter=0;
		max=0;
		average=0;
	}
	public void Add(int number)
	{
		average+=number;
		counter++;
		if(number>max)
		{
			max=number;
		}
	}
	public double takeMax()
	{
		return max;
	}
	public double takeAverage()
	{
		return average/(counter*1.0);
	}
	
}
public class Analyzer {

	public static void main(String[] args) {
		Data dt=new Data();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter number (Q to quit):");
			String s=sc.next();
			if(s.charAt(0)=='Q')
			{
				
				System.out.println(dt.takeAverage());
				System.out.println(dt.takeMax());
				break;
			}
			else
			{
				int number=Integer.parseInt(s);
				dt.Add(number);
			}
			
		}
		

	}

}
