
public class TaSk4 {

	public static void main(String[] args) {
		Student studentObject = new Student("Jason");
		Worker employeeObject = new Worker("Levwa");
		Persona ref = studentObject;
		
		
		String temp= ref.getName();
		System.out.println( temp );
		System.out.println( ref +"\n");
		
		
		ref = employeeObject;
		temp= ref.getName();
		System.out.println( temp );
		System.out.println( ref );
	}

}

class Persona{
	String name;
	Persona(){
		this.name = "NoName";
	}
	Persona(String name_){
		this.name = name_;
	}
	public String getName(){
		return this.name;
	}
	public String toString(){
		return "Persona Name:"+this.name;
	}
}

class Student extends Persona{
	Student(){
		super();
	}
	Student(String name){
		super(name);
	}
	public String getName(){
		System.out.println("Student Name:" + name);
		return name;
	}
	public String toString(){
		return super.toString();
	}
}

class Worker extends Persona{
	Worker(){
		super();
	}
	Worker(String name){
		super(name);
	}
	public String getName(){
		System.out.println("Worker Name:" + name);
		return name;
	}
	public String toString(){
		return super.toString();
	}
}