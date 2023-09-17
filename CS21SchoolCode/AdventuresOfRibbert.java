public class AdventuresOfRibbert{
	String[][] island = new String[19][19];
	int frogRow, frogCol;
	public AdventuresOfRibbert(){
		setUp();
		do{
			showIsland();
			moveFrog();
		}while(frogRow > 0 || frogCol > 0 || frogRow < island.length-1 || frogCol < island[0].length-1);
	 }

		//move da frog
		public void moveFrog(){
			int move = (int)(Math.random() * 4) + 1;
				island[frogRow][frogCol] = " ";
				if(move == 1)
					frogRow++;
				else if(move == 2)
					frogCol++;
				else if(move == 3)
					frogRow++;
				else
					frogCol++;

				island[frogRow][frogCol] = "F";
		}
		public void setUp(){

		frogRow = island.length/2;
		frogCol = island[0].length/2;

		for(int r = 0; r < island[0].length; r++){
			for(int c = 0; c < island.length; c++){
				island[r][c] = " ";
				if(r == 0 || c == 0 || r == island.length - 1 || c == island[0].length-1){
					island[r][c] = "~";
					}
				}
			}
		island[frogRow][frogCol] = "F";

		//Bridge Top
		island[0][island.length/2] = "B";

		//Bridge bottom
		island[island.length-1][island.length/2] = "B";

		//Bridge left
		island[island.length/2][0] = "B";

		//Bridge Right
		island[island.length/2][island[0].length-1] = "B";
	}

	// Display Island
	public void showIsland(){
		for(int r = 0; r < island[0].length; r++){
			for(int c = 0; c < island.length; c++){
				System.out.print(island[r][c]);
				}
				System.out.println();
			}
	}

	public static void main(String[] args){
		AdventuresOfRibbert app = new AdventuresOfRibbert();
	}
}