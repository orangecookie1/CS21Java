import java.util.Scanner;
public class PendulumCalculator{

	public PendulumCalculator(){
		Scanner input = new Scanner(System.in);
		System.out.print("Pendulum Legnth(in meters):");
		double gravity = 9.8;
		double pi = 3.1416;
		double length = input.nextDouble();
		double time = (2)*(pi)*(Math.sqrt(length/gravity));
		System.out.println("Pendulum period is " + time +(" seconds\n"));

		length = 0;
		time = 0;

		System.out.print("Pendulum Legnth(in meters):");
		time = input.nextDouble();
		gravity = 9.8;
		pi = 3.1416;
		length = (time * time)/((2 * pi) * (2 * pi))*(gravity);
		System.out.println("Pendulum length is " + length +(" meters\n"));

	}
	public static void main(String[] args){
		PendulumCalculator app = new PendulumCalculator();
	}
}