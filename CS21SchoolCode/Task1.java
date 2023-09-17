import java.io.*;
import java.lang.*;
import java.util.*;

public class Task1{
	public Task1(){
		File name = new File("file1.txt");
		try{
			BufferedReader input = new BufferedReader(new FileReader(name));
			String text,output="";
			while((text=input.readLine())!= null){
				int num = Integer.parseInt(text);
				if(num>0)
				{
					int prime = 2;
					int count = 1;
					while(count < num){
						prime++;
						if(isPrime(prime)){
							count++;
						}
					}
					String st = "th";
					int last2 = num%100;
					int last = num%10;
					if(last == 1 && last2 != 11){
						st = "st";
					}
					if(last == 2 && last2 != 12){
						st = "nd";
					}
					if(last == 3 && last2 != 13){
						st = "rd";
					}
					System.out.println("The " + count + st + " prime number is " + prime + ".");
				}

			}
		}
		catch (IOException io){
			System.err.println("File does not exist");
		}
	}
	public boolean isPrime(int num){
		for(int x = 2; x<=num/2; x++){
			if(num % x == 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Task1 app=new Task1();
	}
}