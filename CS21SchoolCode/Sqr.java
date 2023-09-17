public class Sqr{
	public Sqr(){
			int rand = (int)(Math.random() * 256 ) + 45;
			System.out.println("Value to estimate sqr: " + rand );

			int ig = rand/2;
			System.out.println("Initial Guess:" + ig);

			double num = ig;

			for (int a = 1 ; a <= 7 ; a++){
				num = (1/2.0) * ((rand / num) + num);
				System.out.println("Step " + a + ": " + num);
			}

			System.out.println("Best estimate after 7 iterations: " + num);
		}
	public static void main(String[] args){
		Sqr app = new Sqr();
		}

}