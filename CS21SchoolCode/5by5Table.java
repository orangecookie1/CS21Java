
public class 5by5Table{
	public 5by5Table(){

		System.out.println(" ");
		int number = 0;
		for(int p=1 ; p<=11 ; p++){
			for(int f=0 ; f<=10 ; f++){
				System.out.print(number*f + "\t");
			}
			for(int z=1 ; z<=1 ; z++){
				System.out.println("\n");
			}
		number++;
		}


	}
	public static void main(String[] args){
		5by5Table app = new 5by5Table();{
			}
		}
}
