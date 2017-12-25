import java.util.Scanner;
public class Converter {

	public static String[] small_numbers= {"", "one", "two", "three", "four",
			"five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
			"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
			"eighteen", "nineteen" };
	public static String[] larger_numbers= {
			"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"
	};
	public static String inWords(int number)
	{
		if(number<20)
		{
			return small_numbers[number];
		}
		if(number<100)
		{
			return larger_numbers[number/10]+((number % 10 != 0) ? " " : "") + small_numbers[number % 10];
		}
		if(number<1000)
		{
			return small_numbers[number/100]+" hundred "+((number % 100 != 0) ? " " : "") + inWords(number % 100);
		}
		if(number<100000)
		{
			return inWords(number/1000)+" thousands"+((number%10000!=0) ? " " : "")+inWords(number%1000);
		}
		return null;
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input==0)
		{
			System.out.println("zero");
			System.exit(0);
		}
		System.out.println(inWords(input));

	}

}
