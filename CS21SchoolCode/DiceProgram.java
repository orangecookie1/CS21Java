public class DiceProgram{

	public DiceProgram(){

	int SixSide = (int)(Math.random()*6) + 1;
	int TenSide = (int)(Math.random()*10) + 1;
	int TwentySide = (int)(Math.random()*20) + 1;
	int sum = SixSide + TenSide + TwentySide;
	int product = SixSide * TenSide * TwentySide;
	double av = (double)sum/3;

	System.out.println("6-Sided Die: " + SixSide);
	System.out.println("10-Sided Die: " + TenSide);
	System.out.println("20-Sided Die: " + TwentySide);
	System.out.println("Sum of Dice: " + sum);
	System.out.println("Product of Dice: " + product);
	System.out.println("Average of dice: " + av);
	}


	public static void main(String[] args){
		DiceProgram app = new DiceProgram();
	}


}