import java.util.Scanner;
public class MathPow{
	public MathPow(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Value: " );
		int val = input.nextInt();
		int pow = 0;
		int num;
		System.out.print("The powers of " + val + " are ");

		do{
			num = (int)Math.pow(val, pow);
			if((int)Math.pow(val, pow + 1) < 10000)
				System.out.print(num + ", ");
			else
				System.out.println("and " + num + ".");
			pow++;
			}while((int)Math.pow(val, pow) < 10000);
	}

	public static void main(String[] args){
		MathPow app = new MathPow();
	}

}