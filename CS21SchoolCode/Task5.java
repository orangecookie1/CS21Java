import java.io.*;
import java.lang.*;
import java.util.*;

public class Task5{
	String[] integers;
	boolean[] checked;
	boolean[] checked2;

	public Task5(){
		File name = new File("File5.txt");
		try{
			BufferedReader input = new BufferedReader(new FileReader(name));
			String text,output="";
			while((text=input.readLine())!= null){
				String num = "";
				for(int x = 0; x < text.length(); x++){
					num += text.charAt(x);
					num += " ";
				}
				checked = new boolean[text.length()];
				checked2 = new boolean[text.length()];
				integers = new String[text.length()];
				integers = num.split(" ");

				for(int x = 0; x < checked.length; x++){
					checked2[x] = true;
				}

				int sum = 0;
				for(int x = 0; x < integers.length; x++){
					sum += Integer.parseInt(integers[x]);
				}

				for(int x = 0; x < integers.length; x++){
					if(Integer.parseInt(integers[x]) == (sum/integers.length)){
						checked[x] = true;
					}
				}

				if(Arrays.equals(checked,checked2)){
					for(int x = 0; x < integers.length; x++){
						System.out.print(integers[x]);
					}
				System.out.println();
				}
			}
		}
		catch (IOException io){
			System.err.println("File does not exist");
		}
	}
	public static void main(String[] args){
		Task5 app=new Task5();
	}
}