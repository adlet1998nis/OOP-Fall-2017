import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Vector;

public class Manager implements Serializable{
	String id;
	String password;
	String name;
	String surname;
	Vector<Course> viewListCourse() throws IOException, ClassNotFoundException {
		Vector<Course> courses= new Vector<Course>();
		Database.desCourses();
		courses=Database.courses;
		return courses;
	}
	void AddCourse(Course course) throws IOException, ClassNotFoundException {
		Database.desCourses();
		Database.courses.addElement(course);
		Database.serCourses();
	}
	void AddCourseToStudent(Course course,Student student) throws ClassNotFoundException, IOException {
		Database.desStudents();
		for (int i=0; i<Database.students.size(); i++) {
			if (student.equals(Database.students.get(i))) {
				Database.students.get(i).courses.addElement(course);
				System.out.println("Found student");
			}
		}
		Database.serStudents();
	}
}
