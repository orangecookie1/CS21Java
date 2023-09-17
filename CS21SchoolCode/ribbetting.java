public class ribbetting
{
	String[][]plane=new String[19][19];
	int frogRow, frogCol;
	public ribbetting(){

		setUp();
		do
		{
			showIsland();
			moveFrog();
		}while(frogRow>0 || frogCol>0 || frogRow<plane.length-1 || frogCol<plane[0].length-1);

	}
	public void setUp()
	{
	frogRow=plane.length/2;
	frogCol=plane[0].length/2;
	for(int r=0; r<plane.length ; r++)
	{
		for(int c=0 ; c<plane[0].length ; c++)
		{
			plane[r][c]=" ";
			if(r==0 || c==0 || r==plane.length-1 || c==plane[0].length-1)
			{
				plane[r][c]="*";
			}
			}
	}
}
	public void showIsland()
	{
	plane[frogRow][frogCol]="\2";
	//top
	plane[0][plane.length/2]="B";
	//bottom
	plane[plane.length-1][plane[0].length/2]="B";
	//right
	plane[plane.length/2][plane[0].length-1]="B";
	//left
	plane[plane.length/2][0] = "B";

		for(int r=0; r<plane.length ; r++){
			for(int c=0 ; c<plane[0].length ; c++){
				System.out.print(plane[r][c]);
				}
			System.out.println();

	}
}
	public void moveFrog(){
			int rand=(int)(Math.random()*4);
			switch(rand)
			{
					case 0:
						frogCol--;
					break;
					case 1:
						frogRow++;
					break;
					case 2:
						frogCol++;
					break;
					case 3:
						frogRow--;
					break;
				}
				plane[frogRow][frogCol]="\2";

}



	public static void main(String[] args){

	ribbetting app=new ribbetting();
	}
}
