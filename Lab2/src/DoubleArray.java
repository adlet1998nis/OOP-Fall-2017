


public class DoubleArray {
	
	public static int[] dArray(int[] a)
	{
		int[] new_array=new int[a.length*2];
		for(int j=0;j<a.length;j++)
		{
			new_array[2*j]=a[j];
			new_array[2*j+1]=a[j];
		}
		return new_array;
		
		
		
	}
	public static void main(String[] args) {
		
		
		int[] a=new int[] {1,2,3,5,7};
	int new_array[] = 	DoubleArray.dArray(a);
	
		
		for(int i=0;i<new_array.length;i++)
		{
			System.out.print(new_array[i]+" ");
		}
		
		

	}

}
