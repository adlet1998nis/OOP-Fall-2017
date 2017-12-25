import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class StudentTester {

	public static void studentMode(Student student) throws IOException, ClassNotFoundException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome "+student.name);
		System.out.println("List of actions");
		System.out.println("1) List of course");
		int mode=Integer.parseInt(reader.readLine());
		if (mode==1) {
			Vector<Course> courses=new Vector<Course>();
			courses=student.courses;
			System.out.println(courses);
		}
	}

}
