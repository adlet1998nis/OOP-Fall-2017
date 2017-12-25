import java.util.*;

public abstract class Piece {
	public enum Player{
		WHITE,
		BLACK
	}
	protected Position curPos;
	protected char symbol;
	protected Player player;
	
	public abstract boolean isLegalMove(Position a, Position b);
}
