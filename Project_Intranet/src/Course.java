import java.io.Serializable;

public class Course implements Serializable {
	String name;

	@Override
	public String toString() {
		return "Course [name=" + name + "]";
	}
	
}
