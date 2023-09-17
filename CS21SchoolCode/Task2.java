import java.io.*;
import java.lang.*;
import java.util.*;

public class Task2{
	public Task2(){
		double[] guess = new double[8];
		File name = new File("File2.txt");
		try{
			BufferedReader input = new BufferedReader(new FileReader(name));
			String text,output="";
			while((text=input.readLine())!= null){
				double num = Double.parseDouble(text);
				double number =  num;
				guess[0] = (int)((num/2) + 1);

				for(int i = 0; i < 7; i++){
					guess[i + 1] = (.5) * ((num/guess[i]) + guess[i]);
				}
				for(int x = 0; x < 8; x++){
					guess[x] = guess[x]*10000;
					guess[x] = (int)guess[x];
					guess[x] = guess[x]/10000;
					System.out.println("After iteration " + x + ": " + guess[x]);
				}
				System.out.println("Sqaure root of " + number + " is " + guess[7] + " after 7 iterations");

			}
		}
		catch (IOException io){
			System.err.println("File does not exist");
		}
	}
	public static void main(String[] args){
		Task2 app=new Task2();
	}
}


