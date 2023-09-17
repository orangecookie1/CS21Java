public class Primejava{

	public Primejava(){

		for(int x = 0; x < 50; x++){
		int rand = (int)(Math.random() * 1000) + 1;
		int div = 2;
		int ans;
		do
		{
			ans = rand % 2;
			div++;
		}while(ans != 0 && div < ans/2);

		if(ans != 0)
			System.out.println("The number " + rand + " is prime");
		else
		System.out.println("The number " + rand + " is not prime");
	}
	}

	public static void main(String[] args){
		Primejava app = new Primejava();
	}

}