
package Third;
public class MyVector extends MyCollection {
	public int[] a = new int[100000];
	public int size;
	public MyVector()
	{
		size=0;
	}
	public MyVector(int []a)
	{
		this.a=a;
	}
	public void add(int element)
	{
		a[size]=element;
		size++;
	}
	public void add(int index,int element)
	{
		if(index>size)
		{
			System.out.println("Impossible");
		}
		else
		{
			
			
			for(int	i=size;i>=index+1;i--)
			{
				a[i]=a[i-1];
			}
			a[index]=element;
			size++;
			
		}
	}
	public void clear()
	{
		int[]b=new int[100000];
		a=b;
		size=0;
	}
	public boolean contains(int o)
	{
		return indexOf(o)!=-1;
	}
	public int get(int index)
	{
		if(index>size)
		{
			return -1;
		}
		else
		return a[index];
	}
	public int indexOf(int o)
	{
		
		for(int i=0;i<size;i++)
		{
			if(o==a[i])
			{
				return i;
			}
		}
		return -1;
		
	}
	public boolean isEmpty()
	{
		if(size==0)
		return true;
		else
		return false;
	}
	public void removeAt(int index)
	{
		if(index==size)
		{
			size--;
		}
		else
		{
		for(int i=index;i<size;i++)
		{
			a[i]=a[i+1];
		}
		size--;
		}
	}
	public void remove(int element)
	{
		int row=0;
		boolean checker=false;
		for(int i=0;i<size;i++)
		{
			if(a[i]==element)
			{
				row=i;
				checker=true;break;
			}
		}
		if(checker==true)
		{
		if(row==size)
		{
			size--;
		}
		else
		{
		for(int i=row;i<size;i++)
		{
			a[i]=a[i+1];
		}
		size--;
		}
		}
		
	}
	public void removeAll(int element)
	{
		int counter=0;
		int b[]=new int[100000];
		
		for(int i=0;i<size;i++)
		{
			if(a[i]==element)
			continue;
			else
			{
				b[counter]=a[i];
				counter++;
			}
		}
		size=counter;
		for(int i=0;i<size;i++)
		{
			a[i]=b[i];
		}
	}
	public void reverse()
	{
		int[] b=new int[100000];
		int counter=0;
		for(int i=size-1;i>=0;i--)
		{
			b[counter]=a[i];
			counter++;
		}
		for(int i=0;i<size;i++)
		{
			a[i]=b[i];
		}
	}
	public void set(int index,int element)
	{
		a[index]=element;
	}
	public int size()
	{
		return size;
	}
	public void sort()
	{
		int temp;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	public void toArray()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public String toString()
	{
		String s="";
		for(int i=0;i<size;i++)
		{
			s+=(char)(a[i]+48);
		}
		return s;
	}
	
}
