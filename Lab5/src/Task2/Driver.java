package Task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.Vector;

public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		 Vector <Course> c1 = new Vector<Course>(); 
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 BufferedReader adminreader=new BufferedReader(new FileReader("C:/JavaCodes/Lab5/src/Task2/admin.txt"));
		 BufferedWriter adminwriter=new BufferedWriter(new FileWriter("C:/JavaCodes/Lab5/src/Task2/admin.txt",true));
		 adminwriter.newLine();
		 System.out.println("Username:");
		 String username=reader.readLine();
		 System.out.println("Password:");
		 String password=reader.readLine();
		 String line;
		 boolean checker_username=false;
		 boolean checker_password=false;
		 int counter=0;
		
		 while((line=adminreader.readLine())!=null)
		 {
			 String d="";
			 if(counter==2)
			 {
				 break;
			 }
			 for(int i=10;i<line.length();i++)
			 {
				 d+=line.charAt(i);
			 }
			 if(counter==0 && d.equals(username))
			 {
				 checker_username=true;
			 }
			 if(counter==1 && d.equals(password))
			 {
				 checker_password=true;
			 }
			 counter++;
		 }
		 if(checker_username==true && checker_password==true)
		 {
			 while (true) {
				 adminwriter.write(LocalDateTime.now().toString()+" admin logged in to a system");
				 adminwriter.newLine();
				 System.out.println("CourseTitle:");
				 String courseTitle=reader.readLine();
				 if (courseTitle.equals("0")) {
					 break;
				 }
				 adminwriter.write(LocalDateTime.now().toString()+" admin added new course - "+courseTitle);
				 adminwriter.newLine();
				 System.out.println("TextbookTitle:");
				 String textbook_title=reader.readLine();
				 System.out.println("Author of textbook:");
				 String authorOfTextbook=reader.readLine();
				 System.out.println("Isbn of textbook:");
				 String isbnOfTextbook=reader.readLine();
				 Textbook textbook=new Textbook(textbook_title,authorOfTextbook,isbnOfTextbook);
				 adminwriter.write(LocalDateTime.now().toString()+" admin added textbook -"+textbook_title+" to course "+courseTitle);
				 adminwriter.newLine();
				 System.out.println("Instructor FirstName:");
				 String firstName=reader.readLine();
				 System.out.println("LastName:");
				 String lastName=reader.readLine();
				 System.out.println("Department:");
				 String department=reader.readLine();
				 System.out.println("Email:");
				 String email=reader.readLine();
				 Instructor instructor=new Instructor(firstName,lastName,department,email);
				 adminwriter.write(LocalDateTime.now().toString()+" admin added instructor - "+firstName+" to course "+courseTitle);
				 adminwriter.newLine();
				 Course course=new Course(courseTitle,instructor,textbook);
				 c1.add(course);
				 
			 }
			 FileOutputStream fos = new FileOutputStream("C:/JavaCodes/Lab5/src/Task2/courseout.txt");
			 ObjectOutputStream oos = new ObjectOutputStream(fos);
			 oos.writeObject(c1);
			 oos.flush();
			 oos.close();
		}
		else
		{
			FileInputStream fis = new FileInputStream("C:/JavaCodes/Lab5/src/Task2/courseout.txt");
			ObjectInputStream oin = new ObjectInputStream(fis);
			Vector<Course> b = (Vector<Course>)oin.readObject();
			System.out.println(b);
			oin.close();
		}
			 
		 
		 reader.close();
		 adminreader.close();
		 adminwriter.close();

	}

}
