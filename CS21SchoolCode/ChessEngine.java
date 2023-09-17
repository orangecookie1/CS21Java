import java.util.Scanner;
public class ChessEngine{
	String[][] board = new String[8][8];
	int queen1 = 0; int queen2 = 0; int a1 = 0; int a2 = 0; int b1 = 0; int b2 = 0; int c1 = 0; int c2 = 0;
	public ChessEngine(){
		run();
	}
	//Sets Chess board
	public void setUp(String piece){
		for(int r = 0; r < board[0].length; r++){
			for(int c = 0; c < board.length; c++){
				board[r][c] = "- ";
			}
		}

		queen1 = Roll(8); queen2 = Roll(8); a1 = Roll(8); a2 = Roll(8); b1 = Roll(8); b2 = Roll(8); c1 = Roll(8); c2 = Roll(8);
		while((queen1 == a1 && queen2 == a2 || queen1 == b1 && queen2 == b2 || queen1 == c2 && queen2 == c2) || (a1 == queen1 && a2 == queen2 || a1 == b2 && a2 == b2 || a1 == c1 && a2 == c2) || (b1 == queen1 && b2 == queen2 || b1 == a1 && b2 == a2 || b1 == c1 && b2 == c2) || (c1 == queen1 && c2 == queen2 || c1 == a1 && c2 == a2 || c1 == b1 && c2 == b2)){
			queen1 = Roll(8); queen2 = Roll(8); a1 = Roll(8); a2 = Roll(8); b1 = Roll(8); b2 = Roll(8); c1 = Roll(8); c2 = Roll(8);
		}

		board[queen1][queen2] = piece;
		board[a1][a2] = "A ";
		board[b1][b2] = "B ";
		board[c1][c2] = "C ";
	}

	public void QueenCheck(){
		int UpLeftX = Math.abs(queen1-a1);
		int UpLeftY = Math.abs(queen2-a2);

		if(queen1 == a1 || queen2 == a2 || (Math.abs(queen1-a1) == Math.abs(queen2-a2)))
			System.out.println("A can be reached by the queen");
		if(queen1 == b1 || queen2 == b2 || (Math.abs(queen1-b1) == Math.abs(queen2-b2)))
			System.out.println("B can be reached by the queen");
		if(queen1 == c1 || queen2 == c2 || (Math.abs(queen1-c1) == Math.abs(queen2-c2)))
			System.out.println("C can be reached by the queen");
	}

	public void RookCheck(){
		if(queen1 == a1 || queen2 == a2)
			System.out.println("A can be reached by the rook");
		if(queen1 == b1 || queen2 == b2)
			System.out.println("B can be reached by the rook");
		if(queen1 == c1 || queen2 == c2)
			System.out.println("C can be reached by the rook");
	}

	public void BishopCheck(){
		int UpLeftX = Math.abs(queen1-a1);
		int UpLeftY = Math.abs(queen2-a2);

		if(Math.abs(queen1-a1) == Math.abs(queen2-a2))
			System.out.println("A can be reached by the bishop");
		if((Math.abs(queen1-b1) == Math.abs(queen2-b2)))
			System.out.println("B can be reached by the bishop");
		if((Math.abs(queen1-c1) == Math.abs(queen2-c2)))
			System.out.println("C can be reached by the bishop");
	}

	public void KingCheck(){
		if(queen1+1 == a1 && queen2 == a2 || queen1-1 == a1 && queen2 == a2 || queen1 == a1 && queen2+1 == a2 || queen1 == a1 && queen2-1 == a2 || queen1+1 == a1 && queen2+1 == a2 || queen1-1 == a1 && queen2-1 == a2 || queen1-1 == a1 && queen2+1 == a2 || queen1+1 == a1 && queen2-1 == a2)
			System.out.println("A can be reached by King");
		if(queen1+1 == b1 && queen2 == b2 || queen1-1 == b1 && queen2 == b2 || queen1 == b1 && queen2+1 == b2 || queen1 == b1 && queen2-1 == b2 || queen1+1 == b1 && queen2+1 == b2 || queen1-1 == b1 && queen2-1 == b2 || queen1-1 == b1 && queen2+1 == b2 || queen1+1 == b1 && queen2-1 == b2)
			System.out.println("B can be reached by King");
		if(queen1+1 == c1 && queen2 == c2 || queen1-1 == c1 && queen2 == c2 || queen1 == c1 && queen2+1 == c2 || queen1 == c1 && queen2-1 == c2 || queen1+1 == c1 && queen2+1 == c2 || queen1-1 == c1 && queen2-1 == c2 || queen1-1 == c1 && queen2+1 == c2 || queen1+1 == c1 && queen2-1 == c2)
			System.out.println("C can be reached by King");
	}

	public void KnightCheck(){
		if(Math.abs(queen1-a1) == 2 && (queen2 + 1 == a2 || queen2 - 1 == a2) || Math.abs(queen2 - a2) == 2 && (queen1 + 1 == a1 || queen1 - 1 == a1))
			System.out.println("A can be reached by the Knight");
		if(Math.abs(queen1-b1) == 2 && (queen2 + 1 == b2 || queen2 - 1 == b2) || Math.abs(queen2 - b2) == 2 && (queen1 + 1 == b1 || queen1 - 1 == b1))
			System.out.println("B can be reached by the Knight");
		if(Math.abs(queen1-c1) == 2 && (queen2 + 1 == c2 || queen2 - 1 == c2) || Math.abs(queen2 - c2) == 2 && (queen1 + 1 == c1 || queen1 - 1 == c1))
			System.out.println("C can be reached by the Knight");
	}

	public void PawnCheck(){
		if(queen1+1 == a1 && queen1+1 == a1 || queen1-1 == a1 && queen1+1 == a1)
			System.out.println("A can be reached by the Pawn");
		if(queen1+1 == a1 && queen1+1 == a1 || queen1-1 == a1 && queen1+1 == a1)
			System.out.println("B can be reached by the Pawn");
		if(queen1+1 == a1 && queen1+1 == a1 || queen1-1 == a1 && queen1+1 == a1)
			System.out.println("C can be reached by the Pawn");
	}

	public void checkHor(String name){
		int aDist=Math.abs(a1-queen1);
		int bDist=Math.abs(b1-queen1);
		int cDist=Math.abs(c1-queen1);

		if(a2==queen2 && b2==queen2 && c2==queen2){
			if((a1 < queen1 && b1 < queen1 && c1 < queen1) || (a1 > queen1 && b1 > queen1 && c1 > queen1)){
				if(aDist < bDist && aDist < cDist)
					System.out.println("A can be captured by the " + name + ".");
				else if(bDist<cDist)
						System.out.println("B can be captured by the "+name+".");
			    else System.out.println("C can be captured by the "+name+".");
			}
			else if(a2 == queen2 && b2 == queen2 &&((a1 < queen1 && b1 < queen1) || (a1 > queen1 && b1 > queen1))){
				if(aDist < bDist)
					System.out.println("A can be captured by the "+name+".");
				else System.out.println("B can be captured by the "+name+".");
				System.out.println("C can be captured by the "+name+".");
			}
		    else if(a2 == queen2 && c2 == queen2 &&((a1 < queen1 && c1 < queen1) ||(a1 > queen1 && c1 > queen1))){
					if(aDist<cDist )
						System.out.println("A can be captured by the "+name+".");
					else System.out.println("C can be captured by the "+name+".");
					System.out.println("B can be captured by the "+name+".");
		   }
		   else if(b2==queen2 && c2==queen2&&((b1 < queen1 && c1 < queen1) ||(b1 > queen1 && c1 > queen1))){
				if(bDist<cDist)
					System.out.println("B can be captured by the "+name+".");
				else System.out.println("C can be captured by the +"+name+".");
				System.out.println("A can be captured by the "+name+".");
		  }
		}
		else if(a2 == queen2 && b2 == queen2 && ((a1 < queen1 && b1 < queen1) ||(a1 > queen1 && b1 > queen1))){
			if(aDist<bDist)
				System.out.println("A can be captured by the "+name+".");
			else System.out.println("B can be captured by the "+name+".");
	   }
	   else if(a2 == queen2 && c2 == queen2 &&((a1 < queen1 && c1 < queen1) || (a1 > queen1 && c1 > queen1)))
	   {
			if(aDist<cDist )
				System.out.println("A can be captured by the "+name+".");
			else System.out.println("C can be captured by the "+name+".");
	   }
   	   else if(b2 == queen2 && c2 == queen2 &&((b1 < queen1 && c1 < queen1) || (b1 > queen1 && c1 > queen1)))
	   {
			if(bDist<cDist )
				System.out.println("B can be captured by the "+name+".");
		    else System.out.println("C can be captured by the "+name+".");
	   }
	   else
	   {
			 if(a2 == queen2)
			 	System.out.println("A can be captured by the "+name+".");
			 if(b2 == queen2)
			 	System.out.println("B can be captured by the "+name+".");
			 if(b2 == queen2)
			 	System.out.println("C can be captured by the "+name+".");
	   }
		  }

	public void checkVert(String name)
	{
		int aDist=Math.abs(a2-queen2);
		int bDist=Math.abs(b2-queen2);
		int cDist=Math.abs(c2-queen2);

		if(a1==queen1 && b1 == queen1 && c1 == queen1)
		{
			if((a2 < queen2 && b2 < queen2 && c2 < queen2) ||(a2 > queen2 && b2 > queen2 && b2 > queen2))
			{
					if(aDist < bDist && aDist < cDist)
						System.out.println("A can be captured by the "+name+".");
					else if(bDist < cDist)
						System.out.println("B can be captured by the "+name+".");
		     		else System.out.println("C can be captured by the "+name+".");
			}
		else if(a1 == queen1 && b1 == queen1 &&((a2 < queen2 && b2 < queen2) || (a2 > queen2 && b2 > queen2)))
	    {
			if(aDist<bDist)
				System.out.println("A can be captured by the "+name+".");
			else System.out.println("B can be captured by the "+name+".");
				System.out.println("C can be captured by the "+name+".");
		}
	   else if(a1 == queen1 && c1 == queen1&&((a2 < queen2 && c2 < queen2) ||(a2 > queen2 && c2 > queen2)))
	   {
			if(aDist<cDist)
				System.out.println("A can be captured by the "+name+".");
			else System.out.println("C can be captured by the "+name+".");
				System.out.println("B can be captured by the "+name+".");
   	   }
   	  else if(b1== queen1 && c1== queen1 &&((b2 < queen2 && c2 < queen2 ) ||(b2 > queen2 && c2 > queen2)))
	  {
			if(bDist<cDist)
				System.out.println("B can be captured by the "+name+".");
	   	    else System.out.println("C can be captured by the "+name+".");
				System.out.println("A can be captured by the "+name+".");
 	  }
			}
	  else if(a1 == queen1 && b1 == queen1 &&((a2 < queen2 && b2 < queen2 ) ||(a2 > queen2 && b2 > queen2)))
	 {
			if(aDist<bDist)
				System.out.println("A can be captured by the "+name+".");
			else System.out.println("B can be captured by the "+name+".");
	 }
	 else if(a1 == queen1 && c1 == queen1 &&((a2 < queen2 && c2 < queen2) || (a2 > queen2 && c2 > queen2)))
	 {
			if(aDist<cDist)
				System.out.println("A can be captured by the "+name+".");
			else System.out.println("C can be captured by the "+name+".");
	 }
	 else if(b1 == queen1 && c1 == queen1 &&((b2 < queen2 && c2 < queen2) || (b2 > queen2 && c2 > queen2)))
	 {
			if(bDist<cDist)
				System.out.println("B can be captured by the "+name+".");
			else System.out.println("C can be captured by the "+name+".");
	 }
	 else
	 {
			 if(a1==queen1)
			 	System.out.println("A can be captured by the "+name+".");
			 if(b1 == queen1)
			 	System.out.println("B can be captured by the "+name+".");
			 if(c1 == queen1)
			 	System.out.println("C can be captured by the "+name+".");
	 }
			}

	public void checkDiag1(String name)
	{
		double aDist=Math.sqrt(Math.pow(a2 - queen2,2)+Math.pow(a1 - queen1,2));
		double bDist=Math.sqrt(Math.pow(b2 - queen2,2)+Math.pow(b1 - queen1,2));
		double cDist=Math.sqrt(Math.pow(c2 - queen2,2)+Math.pow(c1 - queen1,2));

		int aVert=Math.abs(a2-queen2);
		int aHoriz=Math.abs(a1-queen1);
		int bVert=Math.abs(b2-queen2);
		int bHoriz=Math.abs(b1-queen1);
		int cVert=Math.abs(c2-queen2);
		int cHoriz=Math.abs(c1-queen1);

		if(aVert==aHoriz && bVert==bHoriz && cVert==cHoriz && a2 < queen2 && a1 > queen1 && b2 < queen2 && b1 > queen1 && c2 < queen2 && c1 > queen1)
		{
			if(aDist<bDist && aDist<cDist)
				System.out.println("A can be captured by the "+name+".");
			else if(bDist<cDist)
					System.out.println("B can be captured by the "+name+".");
     			else System.out.println("C can be captured by the "+name+".");
		}
		else if(aVert==aHoriz && bVert==bHoriz && a2 < queen2 && a1 > queen1 && b2 < queen2 && b1 > queen1)
		{
			if(aDist<bDist)
				System.out.println("A can be captured by the "+name+".");
			else System.out.println("B can be captured by the "+name+".");
		}
		else if(aVert==aHoriz && cVert==cHoriz && a2 < queen2 && a1 > queen1 && c2 < queen2 && c1 > queen1)
		{
			if(aDist<cDist)
				System.out.println("A can be captured by the "+name+".");
			else System.out.println("C can be catured by the "+name+".");
		}
		else if(bVert==bHoriz && cVert==cHoriz && b2 < queen2 && b1 > queen1 && c2 < queen2 && c1 > queen1)
		{
			if(bDist<cDist)
				System.out.println("B can be captured by the "+name+".");
			else System.out.println("C can be captured by the "+name+".");
		}
		else
		{
			if(aVert==aHoriz && a2 < queen2 && a1 > queen1)
				System.out.println("A can be captured by the "+name+".");
			if(bVert==bHoriz && b2 < queen2 && b1 > queen1)
				System.out.println("B can be captured by the "+name+".");
			if(cVert==cHoriz && c2 < queen2 && c1 > queen1)
				System.out.println("C can be captured by the "+name+".");
		}

	}

	public void checkDiag2(String name)
	{
		double aDist=Math.sqrt(Math.pow(a2 - queen2,2)+Math.pow(a1 - queen1,2));
		double bDist=Math.sqrt(Math.pow(b2 - queen2,2)+Math.pow(b1 - queen1,2));
		double cDist=Math.sqrt(Math.pow(c2 - queen2,2)+Math.pow(c1 - queen1,2));

		int aVert=Math.abs(a2-queen2);
		int aHoriz=Math.abs(a1-queen1);
		int bVert=Math.abs(b2-queen2);
		int bHoriz=Math.abs(b1-queen1);
		int cVert=Math.abs(c2-queen2);
		int cHoriz=Math.abs(c1-queen1);

		if(aVert==aHoriz && bVert==bHoriz && cVert==cHoriz && a2 < queen2 && a1 < queen1 && b2 < queen2 && b1 < queen1 && c2 < queen2 && c1 < queen1)
		{
			if(aDist<bDist && aDist<cDist)
				System.out.println("A can be captured by the "+name+".");
			else if(bDist<cDist)
					System.out.println("B can be captured by the "+name+".");
     			else System.out.println("C can be captured by the "+name+".");
		}
		else if(aVert==aHoriz && bVert==bHoriz && a2 < queen2 && a1 < queen1 && b2 < queen2 && b1 < queen1)
		{
			if(aDist<bDist)
				System.out.println("A can be captured by the "+name+".");
			else System.out.println("B can be captured by the "+name+".");
		}
		else if(aVert==aHoriz && cVert==cHoriz && a2<queen2 && a1<queen1 && c2<queen2 && c1<queen1)
		{
			if(aDist<cDist)
				System.out.println("A can be captured by the "+name+".");
			else System.out.println("C can be catured by the "+name+".");
		}
		else if(bVert==bHoriz && cVert==cHoriz && b2<queen2 && b1<queen1&& c2<queen2 && c1<queen1)
		{
			if(bDist<cDist)
				System.out.println("B can be captured by the "+name+".");
			else System.out.println("C can be captured by the "+name+".");
		}
		else
		{
			if(aVert==aHoriz && a2<queen2 && a1<queen1)
				System.out.println("A can be captured by the "+name+".");
			if(bVert==bHoriz && b2<queen2 && b1<queen1)
				System.out.println("B can be captured by the "+name+".");
			if(cVert==cHoriz && c2<queen2 && c2<queen2)
				System.out.println("C can be captured by the "+name+".");
		}
	}

	public void checkDiag3(String name)
	{
		double aDist=Math.sqrt(Math.pow(a2 - queen2,2)+Math.pow(a1 - queen1,2));
		double bDist=Math.sqrt(Math.pow(b2 - queen2,2)+Math.pow(b1 - queen1,2));
		double cDist=Math.sqrt(Math.pow(c2 - queen2,2)+Math.pow(c1 - queen1,2));

		int aVert=Math.abs(a2-queen2);
		int aHoriz=Math.abs(a1-queen1);
		int bVert=Math.abs(b2-queen2);
		int bHoriz=Math.abs(b1-queen1);
		int cVert=Math.abs(c2-queen2);
		int cHoriz=Math.abs(c1-queen1);

		if(aVert==aHoriz && bVert==bHoriz && cVert==cHoriz && a2 > queen2 && a1 < queen1 && b2 > queen2 && b1 < queen1 && c2 > queen2 && c1 < queen1){
			if(aDist<bDist && aDist<cDist)
				System.out.println("A can be captured by the "+name+".");
			else if(bDist<cDist)
					System.out.println("B can be captured by the "+name+".");
     			else System.out.println("C can be captured by the "+name+".");
		}
		else if(aVert==aHoriz && bVert==bHoriz && a2 > queen2 && a1 < queen1 && b2 > queen2 && b1 < queen1){
			if(aDist<bDist)
				System.out.println("A can be captured by the "+name+".");
			else System.out.println("B can be captured by the "+name+".");
		}
		else if(aVert==aHoriz && cVert==cHoriz && a2 > queen2 && a2 < queen2 && c2 > queen2 && c1 < queen1){
			if(aDist<cDist)
				System.out.println("A can be captured by the "+name+".");
			else System.out.println("C can be catured by the "+name+".");
		}
		else if(bVert==bHoriz && cVert==cHoriz && b2 > queen2 && b1< queen1 && c2 > queen2 && c1 < queen1){
			if(bDist<cDist)
				System.out.println("B can be captured by the "+name+".");
			else System.out.println("C can be captured by the "+name+".");
		}
		else{
			if(aVert==aHoriz && a2 > queen2 && a1 < queen1)
				System.out.println("A can be captured by the "+name+".");
			if(bVert==bHoriz && b2 > queen2 && b1 < queen1)
				System.out.println("B can be captured by the "+name+".");
			if(cVert==cHoriz && c2 > queen2 && c1 < queen1)
				System.out.println("C can be captured by the "+name+".");
		}
	}

	public void checkDiag4(String name){
		double aDist=Math.sqrt(Math.pow(a2 - queen2,2)+Math.pow(a1 - queen1,2));
		double bDist=Math.sqrt(Math.pow(b2 - queen2,2)+Math.pow(b1 - queen1,2));
		double cDist=Math.sqrt(Math.pow(c2 - queen2,2)+Math.pow(c1 - queen1,2));

		int aVert=Math.abs(a2-queen2);
		int aHoriz=Math.abs(a1-queen1);
		int bVert=Math.abs(b2-queen2);
		int bHoriz=Math.abs(b1-queen1);
		int cVert=Math.abs(c2-queen2);
		int cHoriz=Math.abs(c1-queen1);

		if(aVert==aHoriz && bVert==bHoriz && cVert==cHoriz && a2 > queen2 && a1 > queen1 && b2 > queen2 && b1 > queen1 && c2 > queen2&& c1 > queen1){
			if(aDist<bDist && aDist<cDist)
				System.out.println("A can be captured by the "+name+".");
			else if(bDist<cDist)
					System.out.println("B can be captured by the "+name+".");
     			else System.out.println("C can be captured by the "+name+".");
		}
		else if(aVert==aHoriz && bVert==bHoriz && a2 > queen2 && a1 > queen1 && b2 > queen2 && b1 > queen1){
			if(aDist<bDist)
				System.out.println("A can be captured by the "+name+".");
			else System.out.println("B can be captured by the "+name+".");
		}
		else if(aVert==aHoriz && cVert==cHoriz && a2 > queen2 && a1 > queen1 && c2 > queen2 && c1 > queen1){
			if(aDist<cDist)
				System.out.println("A can be captured by the "+name+".");
			else System.out.println("C can be catured by the "+name+".");
		}
		else if(bVert==bHoriz && cVert==cHoriz && b2 > queen2 && b1 > queen1 && c2 > queen2 && c1 > queen1){
			if(bDist<cDist)
				System.out.println("B can be captured by the "+name+".");
			else System.out.println("C can be captured by the "+name+".");
		}
		else{
			if(aVert==aHoriz && a2 > queen2 && a1 > queen1)
				System.out.println("A can be captured by the "+name+".");
			if(bVert==bHoriz && b2 > queen2 && b1 > queen1)
				System.out.println("B can be captured by the "+name+".");
			if(cVert==cHoriz && c2 > queen2 && c1 > queen1)
				System.out.println("C can be captured by the "+name+".");
		}
	}

	public void run(){
		Scanner input = new Scanner(System.in);
		System.out.println("Q queen, B bishop, R rook, K knight, P pawn, k king");
		String piece = input.next();

		if(piece.equals("Q") || piece.equals("q")){
				setUp("Q ");
				displayBoard();
				//QueenCheck();
				checkVert("Queen");
				checkHor("Queen");
				checkDiag1("Queen");
				checkDiag2("Queen");
				checkDiag3("Queen");
				checkDiag4("Queen");
		}
		else if(piece.equals("R") || piece.equals("r")){
			setUp("R ");
			displayBoard();
			//RookCheck();
			checkVert("Rook");
			checkHor("Rook");
		}
		else if(piece.equals("B") || piece.equals("b")){
			setUp("b ");
			displayBoard();
			BishopCheck();
			checkDiag1("Bishop");
			checkDiag2("Bishop");
			checkDiag3("Bishop");
			checkDiag4("Bishop");
		}
		else if(piece.equals("k")){
			setUp("K ");
			displayBoard();
			KingCheck();
		}
		else if(piece.equals("K")){
			for(int x = 0; x < 100; x++){
				setUp("K ");
				displayBoard();
				KnightCheck();
			}
		}
		else if(piece.equals("P") || piece.equals("p")){
			setUp("P ");
			displayBoard();
			PawnCheck();
		}

	}
	//Random number thing i copied from myself
	public int Roll(int sides){
			return (int)(Math.random() * sides);
		}

	public void displayBoard(){

		for(int r = 0; r < board[0].length; r++){
			for(int c = 0; c < board.length; c++){
				System.out.print(board[r][c]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		ChessEngine app = new ChessEngine();
	}
}