
public class Time {
	public int hour;
	public int minute;
	public int second;
	public Time(int hour,int minute,int second)
	{
		this.hour=hour;
		this.minute=minute;
		this.second=second;
		boolean r=false;
		if(this.hour>=0 && this.hour<=24 && this.minute>=0 && this.minute<=60 && this.second>=0 && this.second<=60)
		{
				r=true;
		}
		if(!r)
		{
			System.out.println("That's not correct format");
			System.exit(0);
		}
	}
	public String toUniversal()
	{
		String s="";
		if(this.hour<10)
		{
			s+="0"+Integer.toString(this.hour)+":";
		}
		else
		{
			s+=Integer.toString(this.hour)+":";
		}
		if(this.minute<10)
		{
			s+="0"+Integer.toString(this.minute)+":";
		}
		else
		{
			s+=Integer.toString(this.minute)+":";
		}
		if(this.second<10)
		{
			s+="0"+Integer.toString(this.second);
		}
		return s;
	}
	public String toStandard()
	{
		String s="";
		if(this.hour>=12 && this.minute>0 && this.hour<=23)
		{
			
			s+=Integer.toString(this.hour-12)+":";
			if(this.minute<10)
			{
				s+="0"+Integer.toString(this.minute)+":";
			}
			else
			{
				s+=Integer.toString(this.minute)+":";
			}
			if(this.second<10)
			{
				s+="0"+Integer.toString(this.second)+" PM";
			}
			else
			{
				s+=Integer.toString(this.second)+" PM";
			}
		}
		else
		{
			if(this.hour==24)
			{
				s+="00:";
			}
			else
			{
				s+=Integer.toString(this.hour)+":";
			}
			
			
			if(this.minute<10)
			{
				s+="0"+Integer.toString(this.minute)+":";
			}
			else
			{
				s+=Integer.toString(this.minute)+":";
			}
			if(this.second<10)
			{
				s+="0"+Integer.toString(this.second)+" AM";
			}
			else
			{
				s+=Integer.toString(this.second)+" AM";
			}
		
		}
		return s;
		
		
	}
	public String add(Time x)
	{
		int total=(x.hour*3600+x.minute*60+x.second)+(this.hour*3600+this.minute*60+this.second);
		String s="";
		if((total/3600)%24<10)
		{
			
			s+="0"+Integer.toString((total/(3600))%24)+":";
		}
		else
		{
			s+=Integer.toString(total/(3600)%24)+":";
		}
		if((total%3600)/60<10)
		{
			s+="0"+Integer.toString((total%(3600))/60)+":";
		}
		else
		{
			s+=Integer.toString((total%(3600))/60)+":";
		}
		if((total%3600)%60<10)
		{
			s+="0"+Integer.toString((total%(3600))%60);
		}
		else
		{
			s+=Integer.toString((total%(3600))%60);
		}
		 
		return s;
		
	}
	

	public static void main(String[] args) {
		
		Time t=new Time(1,5,6);
		System.out.println(t.toUniversal());
		System.out.println(t.toStandard());
		Time t2=new Time(4,24,33);
		System.out.println(t.add(t2));
		
	}

}
