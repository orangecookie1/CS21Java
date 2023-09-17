public class ArrayExample
{
	public ArrayExample()
	{
		System.out.println("Array 1:");
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;

		int[] arr=new int[10];
		output(arr);

		System.out.println("Array 2:");
		int[] arr2={1,4,5,8,20};
		output(arr2);

		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[4]);


		//fill array 1 with some random numbers
		for(int x=0;x<arr.length;x++)///10 values in the array, the usable indexes are 0-9
		{
			arr[x]=(int)(Math.random()*100)+1;
		}
		System.out.println("Array 1 - filled with random numbers(1-10):");
		output(arr);

		//find the sum of the random numbers in Array 1
		int sum=0;
		for(int x=0;x<arr.length;x++)
			sum+=arr[x];
		System.out.println("Sum: "+sum);


		//moving values forward inside of an array
		int temp=arr[0];
		for(int x=0;x<arr.length-1;x++)
		{
			arr[x]=arr[x+1];
		}
		arr[arr.length-1]=temp;
		output(arr);

		//Swapping two values in an array
		int temp2=arr[3];
		arr[3]=arr[6];
		arr[6]=temp2;
		output(arr);


		int smallest=arr[0];
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]<smallest)
				smallest=arr[x];

		}
		System.out.println("Smallest: "+smallest);

	}

	public void output(int[] arr)
	{
		for(int x=0;x<arr.length;x++)
			System.out.print(arr[x]+" ");
		System.out.println("\n" );

	}




	public static void main(String[] args)
	{
		ArrayExample app=new ArrayExample();
	}
}