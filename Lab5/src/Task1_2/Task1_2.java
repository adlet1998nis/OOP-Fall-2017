package Task1_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class Task1_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader input=new BufferedReader(new FileReader("C:/JavaCodes/Lab5/src/Task1_1/scores.txt"));
		BufferedWriter output=new BufferedWriter(new FileWriter("C:/JavaCodes/Lab5/src/Task1_1/grades.txt",true));
		String line;
		int totalsum=0;
		int number = 0;
		TreeSet<Integer> grades=new TreeSet<Integer>();
		while((line=input.readLine())!=null)
		{
			number++;
			int it=line.length()-1;
			String d="";
			while(line.charAt(it)!=' ')
			{
				d+=line.charAt(it);
				it--;
			}
			String reverse = new StringBuffer(d).reverse().toString();
			totalsum+=Integer.parseInt(reverse);
			grades.add(Integer.parseInt(reverse));
		}
		double average=totalsum/(number*1.0);
		output.write("Average - "+average);
		output.newLine();
		output.write("Maximum - "+grades.last());
		output.newLine();
		output.write("Minumum - "+grades.first());
		input.close();
		output.close();
		
		

	}

}
