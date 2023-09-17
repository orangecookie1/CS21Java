import java.io.*;
import java.lang.*;
import java.util.*;

public class Task3{
	public Task3(){
		double[] guess = new double[8];
		File name = new File("File3.txt");
		try{
			BufferedReader input = new BufferedReader(new FileReader(name));
			String text,output="";
			while((text=input.readLine())!= null){
				int num = Integer.parseInt(text);
				int number = num;
				String answer = "";
				if(num == 0){
					answer = "0";
				}
				while(num != 0){
					answer = (num % 2) + answer;
					num = num/2;
				}

				System.out.println(number + " in binary is " + answer);

			}
		}
		catch (IOException io){
			System.err.println("File does not exist");
		}
	}
	public static void main(String[] args){
		Task3 app=new Task3();
	}
}


