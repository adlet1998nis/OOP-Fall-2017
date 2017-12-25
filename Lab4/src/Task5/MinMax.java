package Task5;

public class MinMax {
	static class Pair
	{
		public int max;
		public int min;
		public Pair(int max,int min)
		{
			this.max=max;
			this.min=min;
		}
		public String toString()
		{
			return this.max+" "+this.min;
		}
		
	}
	public static Pair minMax(int []a)
	{
		
		int maxi=-1000000000;
		int mini=1000000000;
		for(int i=0;i<a.length;i++)
		{
			if(maxi<a[i])
			{
				maxi=a[i];
			}
			if(mini>a[i])
			{
				mini=a[i];
			}
		}
		Pair pair=new Pair(maxi,mini);
		return pair;
	}
	
}

	
