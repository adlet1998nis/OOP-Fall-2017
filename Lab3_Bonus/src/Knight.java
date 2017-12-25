public class Knight extends Piece{
	
	
	public Knight(int a, int b, String player_, char s){
		super.curPos = new Position(a,b);
		super.symbol = s;
		super.player = player_=="white" ? Player.WHITE : Player.BLACK;
	}
	
	public boolean isLegalMove(Position a, Position b){
		if(a.x>0 && a.x<9 && a.y>0 && a.y<9 && b.x>0 && b.x<9 && b.y>0 && b.y<9){
			if(a.x==b.x && a.y==b.y){
				System.out.println("Positions are the same! Please change them!");
				return false;
			}else{
				return (((Math.abs(a.x-b.x)==1) && (Math.abs(a.y-b.y)==2)) || ((Math.abs(a.x-b.x)==2) && (Math.abs(a.y-b.y)==1)));
			}
		}else{
			System.out.println("It is impossible! Please take coordinates between 1 and 8 as in chess piece");
			return false;
		}
	}
	public String toString(){
		return this.symbol+" ";
	}
}
