import java.util.*;
import java.io.*;
public class User {
	Vector<Piece> figures = new Vector <Piece>();
	
	public void start(){
		Pawn pw1 = new Pawn(1,2, "white", 'P');
		Piece p = pw1;
		figures.addElement(p);		
		Pawn pw2 = new Pawn(2,2, "white", 'P');
		p = pw2;
		figures.addElement(p);
		Pawn pw3 = new Pawn(3,2, "white", 'P');
		p = pw3;
		figures.addElement(p);
		Pawn pw4 = new Pawn(4,2, "white", 'P');
		p = pw4;
		figures.addElement(p);
		Pawn pw5 = new Pawn(5,2, "white", 'P');
		p = pw5;
		figures.addElement(p);
		Pawn pw6 = new Pawn(6,2, "white", 'P');
		p = pw6;
		figures.addElement(p);
		Pawn pw7 = new Pawn(7,2, "white", 'P');
		p = pw7;
		figures.addElement(p);
		Pawn pw8 = new Pawn(8,2, "white", 'P');
		p = pw8;
		figures.addElement(p);
		
		Pawn pb1 = new Pawn(1,7, "black", 'p');
		p = pb1;
		figures.addElement(p);
		Pawn pb2 = new Pawn(2,7, "black", 'p');
		p = pb2;
		figures.addElement(p);
		Pawn pb3 = new Pawn(3,7, "black", 'p');
		p = pb3;
		figures.addElement(p);
		Pawn pb4 = new Pawn(4,7, "black", 'p');
		p = pb4;
		figures.addElement(p);
		Pawn pb5 = new Pawn(5,7, "black", 'p');
		p = pb5;
		figures.addElement(p);
		Pawn pb6 = new Pawn(6,7, "black", 'p');
		p = pb6;
		figures.addElement(p);
		Pawn pb7 = new Pawn(7,7, "black", 'p');
		p = pb7;
		figures.addElement(p);
		Pawn pb8 = new Pawn(8,7, "black", 'p');
		p = pb8;
		figures.addElement(p);
		
		King Kw = new King(4,1,"white", 'K');
		p = Kw;
		figures.addElement(p);
		King Kb = new King(4,8,"black", 'k');
		p = Kb;
		figures.addElement(p);
		
		Queen Qw = new Queen(5,1,"white", 'Q');
		p = Qw;
		figures.addElement(p);
		Queen Qb = new Queen(5,8,"black", 'q');
		p = Qb;
		figures.addElement(p);
		
		Bishop Bww = new Bishop(3,1,"white", 'B');
		p = Bww;
		figures.addElement(p);
		Bishop Bwb = new Bishop(6,1,"white", 'B');
		p = Bwb;
		figures.addElement(p);
		Bishop Bbw = new Bishop(6,8,"black", 'b');
		p = Bbw;
		figures.addElement(p);
		Bishop Bbb = new Bishop(3,8,"black", 'b');
		p = Bbb;
		figures.addElement(p);
		
		Knight Lw1 = new Knight(2,1,"white", 'L');
		p = Lw1;
		figures.addElement(p);
		Knight Lw2 = new Knight(7,1,"white", 'L');
		p = Lw2;
		figures.addElement(p);
		Knight Lb1 = new Knight(2,8,"black", 'l');
		p = Lb1;
		figures.addElement(p);
		Knight Lb2 = new Knight(7,8,"black", 'l');
		p = Lb2;
		figures.addElement(p);
		
		Rook Rw1 = new Rook(1,1,"white", 'R');
		p = Rw1;
		figures.addElement(p);
		Rook Rw2 = new Rook(8,1,"white", 'R');
		p = Rw2;
		figures.addElement(p);
		Rook Rb1 = new Rook(1,8,"black", 'r');
		p = Rb1;
		figures.addElement(p);
		Rook Rb2 = new Rook(8,8,"black", 'r');
		p = Rb2;
		figures.addElement(p);
		
		
		
		draw();
	}
	
	
	
	
	public void draw(){
		boolean picked = false;
		for(int j=7;j>=0;j--){
			System.out.print(j+1);
			for(int i=0;i<8; i++){
				System.out.print("|");
				for(int f=0;f<figures.size();f++){
					if(figures.get(f).curPos.x==i+1 && figures.get(f).curPos.y==j+1){
						System.out.print(figures.get(f).symbol);
						picked=true;
					}
				}
				if(!picked){
					System.out.print(" ");
				}
				picked = false;
			}
			System.out.println("|");
		}
		for(int i=0;i<18;i++){
			System.out.print("-");
		}
		System.out.print("\n"+" -");
		for(int i=0;i<8;i++){
			System.out.print(i+1);
			System.out.print("-");
		}
		System.out.println();
		for(int i=0;i<18;i++){
			System.out.print("-");
		}
		System.out.println();
		
		go();
	}
	
	public void go(){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		String[] coords = str.split(" ");
		int x1 = Integer.parseInt(coords[0]);
		int y1 = Integer.parseInt(coords[1]);
		int x2 = Integer.parseInt(coords[2]);
		int y2 = Integer.parseInt(coords[3]);
		
		for(int i=0; i<figures.size();i++){
			if(figures.get(i).curPos.x==x1 && figures.get(i).curPos.y==y1){
				Position a = new Position(x1,y1);
				Position b = new Position(x2,y2);
				if(figures.get(i).isLegalMove(a, b)){
					eatIfItsPossible(x2, y2);
					figures.get(i).curPos.x = x2;
					figures.get(i).curPos.y = y2;
					draw();
					break;
				}
			}
		}
	}
	public void eatIfItsPossible(int x, int y){
		for(int i = 0; i < figures.size(); i++){
			if(figures.get(i).curPos.x==x && figures.get(i).curPos.y==y){
				figures.remove(i);
			}
		}
	}
	
	
}
