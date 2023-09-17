import java.util.Scanner;
public class FormulaExample{

	public FormulaExample(){
		Scanner input = new Scanner(System.in);

		System.out.print("Money(in Dollars):");
		double money = input.nextDouble();

		int quarters = (int)(money/.25);
		money = money-quarters*.25;
		System.out.println("Num Quarters:" + quarters);


		money=((int)Math.round(money*100))/100.0;


		int dimes = (int)(money/.10);
		money = money-dimes*.10;
		System.out.println("Num Dimes:" + dimes);


		money=((int)Math.round(money*100))/100.0;


		int nickels = (int)(money/.05);
		money = money-nickels*.05;
		System.out.println("Num Nickels:" + nickels);


	 	money=((int)Math.round(money*100))/100.0;


		int penny = (int)Math.round(money*100);
		System.out.println("Num pennies:" + penny);
		money = money-penny*.01;


		System.out.println("Money left over: $"+Math.round(money));
	}

	public static void main(String[] args){
		FormulaExample app = new FormulaExample();
	}
}