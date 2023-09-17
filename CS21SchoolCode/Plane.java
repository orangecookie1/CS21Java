public class Plane{
	public Plane(){
		int x = (int)(Math.random() * 40) - 20;
		int y = (int)(Math.random() * 40) - 20;

		double b = (int)(Math.random() * 25) - 10;

		System.out.println("(" + x + ", " + y + ")");
		System.out.println("Y-Int: " + b + "\n");

		double slope = (y - b) / x;

		System.out.println("Slope: " + slope);



	}
	public static void main(String[] args){
		Plane app = new Plane();
	}
}
