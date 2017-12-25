
public class StarTriangle {
	public int width;
	public StarTriangle(int width) 
	{
		this.width=width;
	}
	String s="";
	int counter=1;
	public String toString()
	{
		while(counter<=this.width)
		{
		for(int i=0;i<counter;i++)
		{
			s+="*";
		}
		
		s+="\n";
		counter++;
		}
		return s;
		
	}
	

	public static void main(String[] args) {
		StarTriangle small=new StarTriangle(9);
		System.out.println(small);
		
		

	}

}
