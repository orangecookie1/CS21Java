public class EvenNumberFinder{
	public EvenNumberFinder(){

		int x = 2;
		int sum = 0;
		while(x < 40000){
			if(x % 2 == 0){
				sum = sum + x;
				}
				x++;
			}
		System.out.println(sum);


	}
	public static void main(String[] args){
		EvenNumberFinder app = new EvenNumberFinder();{
			}
		}
}