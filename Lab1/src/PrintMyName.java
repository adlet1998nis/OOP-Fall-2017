
public class PrintMyName {
	public String first_line="+----+";
	public String second_line="|Adlet|";
	public String last_line="+----+";
	public void showMessage()
	{
		System.out.println(first_line);
		System.out.println(second_line);
		System.out.println(last_line);
		
	}

	public static void main(String[] args) {
		PrintMyName pr=new PrintMyName();
		pr.showMessage();
		
	}

}
