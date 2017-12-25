package Task2;

import java.util.Date;

public class TheUsageOfInter {
	interface Comparable 
	{
	   int compareTo(Object other);
	}
	class Person
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
	}
	class Employee extends Person implements Comparable
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
		
	}
}
