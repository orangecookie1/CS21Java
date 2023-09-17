public class NumberProgramQuiz{
	public NumberProgramQuiz(){

	int b = 0;
		for(int x = 3; x < 8; x++){
			b = 0;
			for(int y = 0; y < 6; y++){
				if(x % 2 == 1){
					b = x - 2;
				System.out.print(b + " ");
					}
				if(x % 2 == 0){
					b++;
					System.out.print(b + " ");
					}
				}
			System.out.println("");
			}
	}
	public static void main(String[] args){
		NumberProgramQuiz app = new NumberProgramQuiz();{
			}
		}
}