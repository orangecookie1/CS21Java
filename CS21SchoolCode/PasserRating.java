import java.util.Scanner;
public class PasserRating{

	public PasserRating(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Completions:");
		double comp = input.nextDouble();

		System.out.println("Enter Attempts:");
		double att = input.nextDouble();

		System.out.println("Enter Yards:");
		double YDS = input.nextDouble();

		System.out.println("Enter Touchdowns:");
		double TD = input.nextDouble();

		System.out.println("Enter Interceptions:");
		double INT = input.nextDouble();

		double a = (comp/att)*(100)-(30)/20;
		double b = (TD/att)*(100)/5;
		double c = (INT/att)*(100)-(9.5)/4;
		double d = (YDS/att)-(3)/4;

		double QBR = (a+b+c+d)/.6;

		System.out.println("Quarterback Rating is:" + QBR);
	}
	public static void main(String[] args)
	{
		PasserRating app = new PasserRating();
	}
}
