package Task2;

import java.io.Serializable;

public class Course implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String courseTitle;
	private Instructor instructor;
	private Textbook textbook;
	public Course(String courseTitle,Instructor instructor,Textbook textbook)
	{
		this.courseTitle=courseTitle;
		this.instructor=instructor;
		this.textbook=textbook;
	}
	public String getCourseTitle()
	{
		return this.courseTitle;
	}
	public Instructor getInstructor()
	{
		return this.instructor;
	}
	public Textbook getTextbook()
	{
		return this.textbook;
	}
	public void setCourseTitle(String courseTitle)
	{
		this.courseTitle=courseTitle;
	}
	public void setInstructor(Instructor instructor)
	{
		this.instructor=instructor;
	}
	public void setTextbook(Textbook textbook)
	{
		this.textbook=textbook;
	}
	public String toString()
	{
		return "CourseTitle:"+this.courseTitle+"."+"Instructor"+this.instructor.toString()+"."+"Textbook"+this.textbook.toString();
	}
	public boolean equals(Object obj)
	{
		Course other=(Course)obj;
		return this.courseTitle.equals(other.courseTitle) && this.instructor.equals(other.instructor) && this.textbook.equals(other.textbook);
	}
	
}
