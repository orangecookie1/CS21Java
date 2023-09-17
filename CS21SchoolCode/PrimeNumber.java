public class PrimeNumber{
	public PrimeNumber(){
		int count = 0;
		int number = 0;
		if(count <= 50)
			number = (int)(Math.random() * 999) + 1;
			count++;
			System.out.println(number);
			System.out.println("Count: " + count);

	}

	public static void main(String[] args){
		PrimeNumber app = new PrimeNumber();
	}

}