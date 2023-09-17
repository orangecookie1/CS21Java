import java.io.*;
import java.lang.*;
import java.util.*;

public class Task4{
	public Task4(){
		File name = new File("File4.txt");
		try{
			BufferedReader input = new BufferedReader(new FileReader(name));
			String text,output="";

			int count = 0;
			while((text=input.readLine())!= null){
				int[] digits = new int[text.length()];
				for(int x = 0; x < digits.length; x++){
					digits[x] = Integer.parseInt(text.substring(x, x+1));
				}

			for(int x = 0; x < digits.length; x++){
				int y=x;
				while(y>0 && digits[y] > digits[y-1]){
					int num = digits[y];
					digits[y] = digits[y-1];
					digits[y-1] = num;
					y--;
				}
			}
			count++;
			System.out.print("Output #" + count + " : ");
			for(int x = 0; x < digits.length; x++){
				System.out.print(digits[x]);
			}
			System.out.println("");

			}
		}
		catch (IOException io){
			System.err.println("File does not exist");
		}
	}
	public static void main(String[] args){
		Task4 app=new Task4();
	}
}


