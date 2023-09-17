public class creditCards{
	long[] numbers = {2156849562116739L, 2156844562116739L, 7074279422551206L, 7073279422551206L, 5856005403799995L, 5856005403795995L, 6491521487897603L, 6491531487897603L, 6317673078116018L, 63171730781160128L};
	public creditCards(){
		for(int x = 0; x < numbers.length; x++){
			if(cards(numbers[x])){
				System.out.println("VALID");
			}else{
				System.out.println("INVALID");
			}
		}
	}
	public int mathThing(int num){
		int answer1 = num % 10;
		int answer2 = (num/10) - (answer1/10);

		return answer1+answer2;
	}
	public boolean cards(long num){
		int answer = (int)(num % 10);
		long payload = (num/10) - (answer/10);
		int answer2 = 0;
		int prev = 0;

		for(int x = 0; x < 16; x++){
			prev = (int)(payload%10);
			payload = (payload/10) - (prev/10);

			if(x%2 == 0){
				answer2 += mathThing(prev*2);
			}
			if(x % 2 != 0){
				answer2 += prev;
			}
		}
		answer2 = answer2 % 10;
		answer2 = 10 - answer2;

		if(answer2 == answer)
			return true;
		else
			return false;
}
	public static void main(String[] args){
		creditCards app = new creditCards();
	}
}