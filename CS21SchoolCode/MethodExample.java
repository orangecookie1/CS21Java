public class MethodExample{
	public MethodExample(){
		int dice1 = roll();
		int dice2 = roll();
		output(dice1);
		output(dice2);
		System.out.println("Sum:" + sum(die1, die2));
		if(isEven(sum(die1, die2)))
			System.out.print("Sum is Even!");
			else System.out.print("Sum is Even!");

	}
	public int roll(){
		return (int)(Math.random()+ 1) * 6;
		}
	public void output(int num){
		System.out.println("Die:" + num);
		}
	public int sum(int n1, int n2){
		return n1 + n2;
		}
	public boolean even(){
		return sum%2==0;
		}
	public static void main(String[] args){
		MethodExample app = new MethodExample();{
			}
		}
}

