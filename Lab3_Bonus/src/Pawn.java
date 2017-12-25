
public class Pawn extends Piece {
	
	
	
	public Pawn(int a, int b, String player_, char s){
		super.curPos = new Position(a,b);
		super.symbol = s;
		super.player = player_=="white" ? Player.WHITE : Player.BLACK;
	}
	
	public boolean isLegalMove(Position a, Position b){
		if(a.x>0 && a.x<9 && a.y>0 && a.y<9 && b.x==a.x && b.y>0 && b.y<9){
			if(a.x==b.x && a.y==b.y){
				System.out.println("Positions are the same! Please change them!");
				return false;
			}else{
				return ((Math.abs(b.y-a.y)==1) || ((a.y==2 || a.y==7) && Math.abs(b.y-a.y)==2));
			}
		}else{
			System.out.println("It is impossible! Please think before you type!");
			return false;
		}
	}
	public String toString(){
		return this.symbol+" ";
	}
}
