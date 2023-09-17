public class RandomStuffandLoops{

	public RandomStuffandLoops(){
		int numOfNum = (int)(Math.random()* 26) + 10;
		System.out.println("Number of Numbers: " + numOfNum);

		double sum = 0;
		for(int x = 0;x < numOfNum; x++){
			int num = (int)(Math.random()*146) + 12;
			sum = sum + num;
			System.out.println(num);
		}
		System.out.println("Sum of all of he Numbers " + sum);
		System.out.println("Average of the Numbers: " + sum/numOfNum);

	}

		public static void main(String args[]){
			RandomStuffandLoops app = new RandomStuffandLoops();
			}
}