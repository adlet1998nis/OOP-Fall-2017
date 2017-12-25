import java.util.Vector;
enum Gender
{
	BOY,
	GIRL
}
class Person 
{
	Gender gender;
	public Person(Gender gender)
	{
		this.gender=gender;
	}
	public String toString()
	{
		return gender.toString();
	}
}
public class DragonLaunch {
	Vector <Person> v=new Vector<Person>();
	public void kindap(Person p)
	{
		v.addElement(p);
	}
	public boolean willDragonEatorNot()
	{
		int counter=0;
		for(int i=0;i<v.size();i++)
		{
			if(v.elementAt(i).gender==Gender.BOY)
			{
			counter++;
			}
			else if(v.elementAt(i).gender==Gender.GIRL)
			{
			counter--;
			}
			if(counter<0)
			{
			return true;
			}
		}
		
		return (counter!=0);
	}
	
	
	public static void main(String[] args) {
		
		Person p1=new Person(Gender.BOY);
		Person p2=new Person(Gender.GIRL);
		DragonLaunch d=new DragonLaunch();
		d.kindap(p1);
		d.kindap(p2);
		d.kindap(p1);
		d.kindap(p2);
		System.out.println(d.willDragonEatorNot());
		
	}

}
