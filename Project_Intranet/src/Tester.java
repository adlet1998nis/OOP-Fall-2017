import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class Tester implements Serializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		Student s1= new Student();
//		s1.id="16BD21";
//		s1.name="Askhat";
//		s1.password="123";
//		Database.students.addElement(s1);
//		Database.serStudents();
//		Manager m1= new Manager();
//		m1.id="15M00";
//		m1.name="Borys";
//		Database.managers.addElement(m1);
//		Database.serManagers();
		System.out.println("Welcome to our Intranet!");
		System.out.println("Choose your mode");
		System.out.println("1)Admin");
		System.out.println("2)Student");
		System.out.println("3)Manager");
		System.out.println("4)Teacher");
		String ans = reader.readLine();
		int mode=Integer.parseInt(ans);
		if (mode==1) {
			AdminTester.adminMode();
		}
		if (mode==2) {
			Database.desStudents();
			String studentId=reader.readLine();
			for (int i=0; i<Database.students.size(); i++) {
				if (studentId.equals(Database.students.get(i).id)) {
					StudentTester.studentMode(Database.students.get(i));
				}
			}
			
		}
		if (mode==3) {
			Database.desManagers();
			String managerId=reader.readLine();
			for (int i=0; i<Database.managers.size(); i++) {
				if (managerId.equals(Database.managers.get(i).id)) {
					ManagerTester.managerMode(Database.managers.get(i));
				}
			
		}
		if (mode==4) {
			TeacherTester.teacherMode();
		}
		
	}
  }
}
