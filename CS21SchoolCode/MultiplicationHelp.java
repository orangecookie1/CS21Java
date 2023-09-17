import java.util.Scanner;
public class MultiplicationHelp{
	public MultiplicationHelp(){
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Multiplication Tutor!");
		System.out.print("What is your Name?");
		String name = input.next();
		System.out.println("Let see how good you are at multiplication, " + name);
		System.out.println("Type -1 at anytime to exit and see your score!");

		int Actualanswer = 0;
		int answer = 0;
		int totalprob = 0;
		int correctprob = 0;

		while(answer != -1){
			int num1 = (int)(Math.random() * 10) + 1;
			int num2 = (int)(Math.random() * 10) + 1;
			Actualanswer = num1* num2;

			System.out.print("What is " + num1 + " * " + num2 + "?");
			answer = input.nextInt();

			if(answer != -1){
				totalprob++;
				if(Actualanswer == answer){
					System.out.println("Correct!");
					correctprob++;
					}
				else{
					System.out.println("Incorrect! The correct answer was " + Actualanswer);}
				}


			if(answer == -1){
				System.out.println("Let's see, " + name + "! You got " + correctprob + " out of " + totalprob + " correct.");
				double grade = (double)correctprob/totalprob;
					if(grade == 1){
						System.out.println("You have mastered multiplication!");
						}
					else if(grade >= .75 && grade < 1){
						System.out.println("You almost got it! Keep working!");
						}
					else{
						System.out.println("You almost got it! Keep working!");
						}
				}

			}
	}
	public static void main(String[] args){
		MultiplicationHelp app = new MultiplicationHelp();{
			}
		}
}

