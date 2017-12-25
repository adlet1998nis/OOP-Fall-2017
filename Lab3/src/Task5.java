import java.lang.Math;
abstract class Piece
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
class King extends Piece
{
	public boolean isLegal(Position a,Position b)
	{
		if(a.x==b.x && Math.abs(a.y-b.y)==1)
		{
			return true;
		}
		else if(a.y==b.y && Math.abs(a.x-b.x)==1)
		{
			return true;
		}
		else if(Math.abs(b.y-a.y)==1 && Math.abs(b.x-a.x)==1)
		{
			return true;
		}
		return false;
	}
}
class Queen extends Piece
{
		
	public boolean isLegal(Position b)
	{
		return isLegal(a,b);
	}
	
	public static boolean isLegal(Position a,Position b)
	{
		if(a.x==b.x || a.y==b.y || a.x+b.x==a.y+b.y || Math.abs(a.x-b.x)==Math.abs(a.y-b.y))
		{
			return true;
		}
		return false;
	}
}
class Rook extends Piece
{
	
	public boolean isLegal(Position a,Position b)
	{
	if(a.x==b.x || a.y==b.y)
	{
		return true;
	}
	return false;
	}
}
class Bishop extends Piece
{
	public boolean isLegal(Position a,Position b)
	{
		if(a.x+a.y==b.x+b.y || Math.abs(b.x-a.x)==Math.abs(b.y-a.y))
		{
			return true;
		}
		return false;
	}
}
class Knight extends Piece
{
	public boolean isLegal(Position a,Position b)
	{
		if(Math.abs(b.y-a.y)==2 && Math.abs(b.x-a.x)==1 ||Math.abs(b.y-a.y)==1 && Math.abs(b.x-a.x)==2)
		{
			return true;
		}
		return false;
	}

}
class Peshka extends Piece
{
	public boolean isLegal(Position a,Position b)
	{
		if(a.x!=b.x)
		{
			return false;
		}
		else if(a.y==2 && b.y-a.y==2 || b.y-a.y==1)
		{
			return true;
		}
		return false;
	}

}
public class Task5 {

	public static void main(String[] args) {
		
		Position p1=new Position(4,4);
		Position p2=new Position(5,5);
		King king=new King();
		Queen queen=new Queen();
		Rook rook=new Rook();
		Bishop bishop=new Bishop();
		Knight knight=new Knight();
		System.out.println(king.isLegal(p1,p2));
		System.out.println(queen.isLegal(p1,p2));
		System.out.println(rook.isLegal(p1,p2));
		System.out.println(bishop.isLegal(p1,p2));
		System.out.println(knight.isLegal(p1,p2));
		
	}

}
