import java.util.Scanner;
public class AverageCalc{
	public AverageCalc(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter First Double: ");
		double one = input.nextDouble();

		System.out.println("Enter Second Double: ");
		double two = input.nextDouble();

		System.out.println("Enter Third Double: ");
		double three = input.nextDouble();

		System.out.println("Enter Fourth Double: ");
		double four = input.nextDouble();

		System.out.println("Enter Fifth Double: ");
		double five = input.nextDouble();

		double sum = one + two + three + four + five;
		double avg = sum/5.0;

		System.out.println("Sum:" + sum);
		System.out.println("Avg:" + avg);
	}
	public static void main(String[] args){
		AverageCalc app = new AverageCalc();{
			}
		}
}

