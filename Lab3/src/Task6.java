abstract class Piecer
{
	Position a;
	public abstract boolean isLegal(Position b);
}
class Position
{
	public int x;
	public int y;
	public Position(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}
class Rooker
{
	public static boolean isLegal(Position a,Position b)
	{
	if(a.x==b.x || a.y==b.y)
	{
		return true;
	}
	return false;
	}
}
public class Task6 {

	public static void main(String[] args) {
		

	}

}
