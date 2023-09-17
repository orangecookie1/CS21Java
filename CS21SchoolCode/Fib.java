import java.util.Scanner
public class Fib{

	public Fib(){
		Scanner input = new Scanner();
		System.out.print("Enter the term of the Fibancci sequence: ")

		int term = input.nextInt();

		int a = 0;
		int b = 1;
		int c = a + b;

		for(int count = 0; count <= count; count++){
				 c = a + b;
				 a = b;
				 b = c;
			}

		System.out.println("The value of the sequence at the" + term + " is " + c);
	}
	public static void main(String[] args){
		Fib app = new Fib();
	}
}
