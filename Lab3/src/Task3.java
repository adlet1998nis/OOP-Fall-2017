import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

class Person implements Cloneable
{
	private String name;
	public Person()
	{
		name="";
	}
	public Person(String name)
	{
		this.name=name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public boolean equals(Person p)
	{
		return this.name.equals(p.name);
	}
	public String toString()
	{
		return this.name+" ";
	}
	public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Employee extends Person implements Comparable,Cloneable
{
	private double salary;
	private Date hireDate;
	private String insuranceNumber;
	public Employee()
	{
		super();
		salary=0;
		hireDate=null;
		insuranceNumber="";
	}
	public Employee(String name,double salary,Date hireDate,String insuranceNumber)
	{
		super(name);
		this.salary=salary;
		this.hireDate=hireDate;
		this.insuranceNumber=insuranceNumber;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return this.salary;
	}
	public void setHireDate(Date hireDate)
	{
		this.hireDate=hireDate;
	}
	public Date getHireDate()
	{
		return this.hireDate;
	}
	public void setInsuranceNumber(String insuranceNumber)
	{
		this.insuranceNumber=insuranceNumber;
	}
	public String getInsuranceNumber()
	{
		return this.insuranceNumber;
	}
	public boolean equals(Employee e)
	{
		return super.equals(e) && this.salary==e.salary &&  this.hireDate.equals(e.hireDate) && this.insuranceNumber==e.insuranceNumber;
	}
	public String toString()
	{
		return super.toString()+this.salary+" "+this.hireDate+" "+this.insuranceNumber+" ";
	}
	public int compareTo(Object obj)
	{
		Employee emp=(Employee)obj;
		if(this.salary>emp.salary)
		return 1;
		else if(this.salary==emp.salary)
		return 0;
		else
		return -1;
		
	}
	public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	
}
class Manager extends Employee implements Comparable,Cloneable
{
	private Vector <Employee> emp=new Vector <Employee>();
	private int bonus;
	public Manager()
	{
		super();
		bonus=0;
		emp=null;
	}
	public Manager(String name,double salary,Date hireDate,String insuranceNumber,int bonus)
	{
		super(name,salary,hireDate,insuranceNumber);
		this.bonus=bonus;
	}
	
	public void setBonus(int bonus)
	{
		this.bonus=bonus;
	}
	public int getBonus()
	{
		return this.bonus;
	}
	public void addEmployee(Employee e)
	{
		emp.addElement(e);
	}
	public boolean equals(Manager m)
	{
		return super.equals(m) && this.emp.equals(m.emp) && this.bonus==m.bonus;
	}
	public String toString()
	{
		String s="";
		for(int i=0;i<emp.size();i++)
		{
			s+=emp.get(i).getName()+" ";
		}
		return super.toString()+s+" "+this.bonus+" ";
	}
	public int compareTo(Object obj)
	{
		Manager mg=(Manager)obj;
		if(this.getSalary()>mg.getSalary())
		return 1;
		else if(this.getSalary()==mg.getSalary())
		{
			if(this.bonus>mg.bonus)
			return 1;
			else if(this.bonus<mg.bonus)
			return -1;
			else
			return 0;

		}
		else
		return -1;
		
		
	}
	public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}



public class Task3 {

	public static void main(String[] args) throws ParseException, CloneNotSupportedException {
		Person p = new Person("Borya");
		Person q = (Person)p.clone();
		
		System.out.println(p.equals(q));
		System.out.println(q.toString());
		System.out.println();
		
		SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		Date d1=df.parse("12-10-2011");
		Date d2=df.parse("11-10-2013");
		Employee e = new Employee("Beke", 200.2,d1, "17BD02128");
		Employee w = new Employee("Chu", 200.2,d2, "17BD02128");
		
		
		System.out.println(e.equals(w));
		System.out.println(e.toString());
		System.out.println();
		
		Date d3=df.parse("05-10-2011");
		Date d4=df.parse("06-10-2013");
		Manager m = new Manager("Deny", 151.8, d3, "15BD01234", 10);
		Manager n = new Manager("Doni", 151.8, d4, "15BD01234", 10);
		m.addEmployee(e);
		m.addEmployee(w);
		
		
		
		System.out.println(m.equals(n));
		System.out.println(m.toString());
		
	}

}
