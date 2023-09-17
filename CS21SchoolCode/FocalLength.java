import java.util.Scanner;
public class Main{
	
  public Main(){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Optic Distance(mm): " );
    double optDist = 1/input.nextDouble();
    
    System.out.println("Enter image Distance(mm): ");
    double imgDist = 1/input.nextDouble();
    
    double focLen = (imgDist) + (optDist);
    focLen = (1/focLen);
    System.out.println("The Focal Length is: " + focLen + "\n\n");

    focLen = 0;
    imgDist = 0;
    optDist = 0;
    
    System.out.println("Enter Focal Length(mm): " );
    focLen = 1/input.nextDouble();
    
    System.out.println("Enter optic Distance(mm): ");
    optDist = 1/input.nextDouble();
    
    imgDist = (focLen) - (optDist);
    imgDist = (1/imgDist);
    System.out.println("The Image Distance is: " + imgDist + "\n\n");

    focLen = 0;
    imgDist = 0;
    optDist = 0;

    System.out.println("Enter Focal Length(mm): " );
    focLen = 1/input.nextDouble();
    
    System.out.println("Enter image Distance(mm): ");
    imgDist = 1/input.nextDouble();
    
    optDist = (focLen) - (imgDist);
    optDist = (1/optDist);
    System.out.println("The Optic Distance is: " + optDist);
    
	}
	public static void main(String[] args){
		Main app = new Main(); 
	}
}
