package Task2;

import java.io.Serializable;

public class Instructor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String department;
	private String email;
	public Instructor(String firstName,String lastName,String department,String email)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.department=department;
		this.email=email;
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	public String getDepartment()
	{
		return this.department;
	}
	public String getEmail()
	{
		return this.email;
	}
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	public void setDepartment(String department)
	{
		this.department=department;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String toString()
	{
		return "FirstName:"+this.firstName+"."+"LastName"+this.lastName+"."+"Department"+this.department+"."+"Email"+this.email;
	}
	public boolean equals(Object obj)
	{
		Instructor other=(Instructor)obj;
		return this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName) && this.department.equals(other.department) && this.email.equals(other.email);
	}
	
	
}

