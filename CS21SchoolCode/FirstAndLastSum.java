import java.util.Scanner;
public class FirstAndLastSum{
	public FirstAndLastSum(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int number = input.nextInt();
		int lnum = 0;
		int fnum = 0;
		int snumber = 0;

		snumber = number / 10;
		snumber = snumber * 10;
		lnum = number - snumber;
		snumber = 0;

		snumber = number / 1000;
		fnum = snumber;
		snumber = 0;

		int sum = fnum + lnum;

		System.out.println("The sum of the first and last digit is " + sum + ".");


	}
	public static void main(String[] args){
		FirstAndLastSum app = new FirstAndLastSum();{
			}
		}
}