import java.util.Scanner;
public class ProportionSolver{

	public ProportionSolver(){
		Scanner input = new Scanner(System.in);

		System.out.println(" a       c");
		System.out.println("---  =  ---");
		System.out.println(" b       d\n");


		System.out.println("Initial Value:\n");

		System.out.print("a = ");
		int a = input.nextInt();

		System.out.print("b = ");
		int b = input.nextInt();

		System.out.print("c = ");
		int c = input.nextInt();
		System.out.println("");

		System.out.println("Equation:\n");
		System.out.println(" 20       26");
		System.out.println("---  =   ---");
		System.out.println(" 41       d\n");

		double d = (double)(b * c) / a;

		System.out.println("Solution:");
		System.out.println("d = " + d);

		}
	public static void main(String[] args)
	{
		ProportionSolver app = new ProportionSolver();
	}
}
