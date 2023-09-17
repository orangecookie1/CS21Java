import java.util.Scanner;
public class FahrenheitToCelsius{

	public FahrenheitToCelsius(){
		Scanner input = new Scanner(System.in);

		System.out.print("Temprature (in Fahrenheit):");
		double f = input.nextDouble();
		double c = (int)(f-32)*(5)/(9);
		System.out.println("Temprature in Celsius is: " + c + "\n");

		f = 0;
		c = 0;


		System.out.print("Temprature (in Celsius):");
		c = input.nextDouble();
		f = (int)(c)*(9)/(5)+(32);
		System.out.println("Temprature in Fahrenheit is: " + f);
	}

	public static void main(String[] args){
		FahrenheitToCelsius app = new FahrenheitToCelsius();
	}
}