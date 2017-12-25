import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class ManagerTester {


	public static void managerMode(Manager manager) throws NumberFormatException, IOException, ClassNotFoundException {
		System.out.println("Welcome Manager" + manager.name);
		System.out.println("1) List Courses");
		System.out.println("2) Add course");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int mode = Integer.parseInt(reader.readLine());
		if (mode==1) {
			Vector<Course> listCourse=new Vector<Course>();
			listCourse=manager.viewListCourse();
			System.out.println(listCourse);
		}
		if (mode==2) {
			Course c1 = new Course();
			System.out.println("Print name:");
			String courseName=reader.readLine();
			c1.name=courseName;
			manager.AddCourse(c1);
		}
		if (mode==3) {
			Student student= new Student();
			Course course= new Course();
			System.out.println("Print id of student:");
			String nameStudent= reader.readLine();
			Database.desStudents();
			for (int i=0; i<Database.students.size(); i++) {
				if (Database.students.get(i).id.equals(nameStudent)) {
					student=Database.students.get(i);
					System.out.println("Found");
					break;
				}
			}
			System.out.println("Choose course");
			Vector<Course> courses=new Vector<Course>();
			courses=manager.viewListCourse();
			System.out.println(courses);
			String nameCourse=reader.readLine();
			for (int i=0; i<courses.size(); i++) {
				if (nameCourse.equals(courses.get(i).name)) {
					course=courses.get(i);
					break;
				}
			}
			manager.AddCourseToStudent(course, student);

		}
	}

}
