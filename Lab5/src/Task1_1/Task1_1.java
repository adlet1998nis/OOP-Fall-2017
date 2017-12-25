package Task1_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;
import java.util.Vector;

public class Task1_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader input=new BufferedReader(new FileReader("C:/JavaCodes/Lab5/src/Task1_1/scores.txt"));
		BufferedWriter output=new BufferedWriter(new FileWriter("C:/JavaCodes/Lab5/src/Task1_1/grades.txt"));
		String line;
		Vector<Integer> marks=new Vector<Integer>();
		TreeSet<Integer> grades=new TreeSet<Integer>();
		while((line=input.readLine())!=null)
		{
			int it=line.length()-1;
			String d="";
			while(line.charAt(it)!=' ')
			{
				d+=line.charAt(it);
				it--;
			}
			String reverse = new StringBuffer(d).reverse().toString();
			marks.add(Integer.parseInt(reverse));
			grades.add(Integer.parseInt(reverse));
			
		}
		int number=0;
		BufferedReader input1=new BufferedReader(new FileReader("C:/JavaCodes/Lab5/src/Task1_1/scores.txt"));
		while((line=input1.readLine())!=null)
		{
			String writeable="";
			writeable+=Integer.toString(number+1)+") ";
			int it=line.length()-1;
			while(line.charAt(it)!=' ')
			{
				it--;
			}
			for(int i=0;i<it;i++)
			{
				writeable+=line.charAt(i);
			}
			if(marks.get(number)>=grades.last()-10)
			{
				writeable+="-A";
			}
			else if(marks.get(number)>=grades.last()-20)
			{
				writeable+="-B";
			}
			else if(marks.get(number)>=grades.last()-30)
			{
				writeable+="-C";
			}
			else if(marks.get(number)>=grades.last()-40)
			{
				writeable+="-D";
			}
			else
			{
				writeable+="-F";
			}
			number++;
			output.write(writeable);
			output.newLine();
			
		}
		
		input.close();
		output.close();
		input1.close();
		

	}

}
