import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class Database implements Serializable{
	static Vector<Course> courses = new Vector<Course>();
	static Vector<Student> students  = new Vector<Student>();
	static Vector<Admin> admins  = new Vector<Admin>();
	static Vector<Teacher> teachers  = new Vector<Teacher>();
	static Vector<Manager> managers  = new Vector<Manager>();
	static Vector<Group> groups = new Vector<Group>();
	static FileInputStream fis;
	static FileOutputStream fos;
	static ObjectOutputStream oos;
	static ObjectInputStream oin;
	public static void desCourses() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("courses");
		oin = new ObjectInputStream(fis);
		courses = (Vector<Course>) oin.readObject();
	}
	public static void serCourses()throws IOException{
		fos = new FileOutputStream("courses");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(courses);
		oos.close();
	}
	public  static void desStudents() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("students");
		oin = new ObjectInputStream(fis);
		students = (Vector<Student>) oin.readObject();
	}
	
	public static void serStudents()throws IOException{
		fos = new FileOutputStream("students");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(students);
		oos.close();
	}
	public static void desAdmins() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("admins");
		oin = new ObjectInputStream(fis);
		admins = (Vector<Admin>) oin.readObject();
	}
	public static void serAdmins()throws IOException{
		fos = new FileOutputStream("admins");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(admins);
		oos.close();
	}
	public static void desManagers() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("managers");
		oin = new ObjectInputStream(fis);
		managers = (Vector<Manager>) oin.readObject();
	}
	public static void serManagers()throws IOException{
		FileOutputStream fos1 = new FileOutputStream("managers");
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		oos1.writeObject(managers);
		oos1.close();
	}
	public static void desTeachers() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("teachers");
		oin = new ObjectInputStream(fis);
		teachers = (Vector<Teacher>) oin.readObject();
	}
	public static void serTeachers()throws IOException{
		fos = new FileOutputStream("teachers");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(teachers);
		oos.close();
	}
	public static void desGroups() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("groups");
		oin = new ObjectInputStream(fis);
		groups = (Vector<Group>) oin.readObject();
	}
	public static void serGroups()throws IOException{
		fos = new FileOutputStream("groups");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(groups);
		oos.close();
	}
}
