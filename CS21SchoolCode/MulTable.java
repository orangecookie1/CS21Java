public class MulTable{
	public MulTable(){

		System.out.println(" ");
		int number = 0;
		for(int p=1 ; p<=6 ; p++){
			for(int f=0 ; f<=5 ; f++){
				System.out.print(number*f + "\t");
			}
			for(int z=1 ; z<=1 ; z++){
				System.out.println("\n");
			}
		number++;
		}



	}
	public static void main(String[] args){
		MulTable app = new MulTable();{
			}
		}
}
