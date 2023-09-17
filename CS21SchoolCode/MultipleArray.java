public class MultipleArray{
	public MultipleArray(){
		int[][]numbers = new int[10][10];

		for(int r = 0; r < numbers[0].length; r++){
			for(int c = 0; c < numbers.length; c++){
				numbers[r][c] = (int)(Math.random() * 41) + 10;
				System.out.print(numbers[r][c] + "    ");
			}
			System.out.println();
		}

		System.out.println("========================================================");
		int sumAll = 0;
		int sum = 0;
		int sum1 = 0;

		for(int r = 0; r < numbers[0].length; r++){
			for(int c = 0; c < numbers.length; c++){
				sumAll = sumAll + numbers[r][c];
			}
		}

		System.out.println("Sum of All: " + sumAll);

		for(int x = 0; x < numbers[0].length; x++){
			for(int c = 0; c < numbers.length; c++){
				sum = sum + numbers[x][c];
			}
			for(int r = 0; r < numbers.length; r++){
				sum1 = sum1 + numbers[r][x];
			}
			System.out.println("Row " + x + " sum: " + sum + " + " + "Col " + x + " sum: " + sum1);
			sum = 0;
			sum1 = 0;
		}

	System.out.println("========================================================");

		for(int x = 0; x < numbers[0].length; x++){
			for(int c = 0; c < numbers.length; c++){
				sum = sum + numbers[x][c];
			}
			for(int r = 0; r < numbers.length; r++){
				sum1 = sum1 + numbers[r][x];
			}
			System.out.println("Row " + x + " sum: " + sum + " + " + "Col " + x + " sum: " + sum1);
			sum = 0;
			sum1 = 0;
		}
	System.out.println("========================================================");

		int maxCol = 0;
		int minCol = 0;
		int minRow = 0;
		int maxRow = 0;

		for(int o = 0; o < 10; o++){
				maxCol = 0;
				minCol = 0;
				minRow = 0;
				maxRow = 0;

				System.out.println("Row " + o + " max: " + MaxRow(numbers, o) + " | "
				+ "Col " + o + " max: " + MaxCol(numbers, o) + " | "
				+ "Row " + o + " min: " + MinRow(numbers, o) + " | "
				+ "Col " + o + " min: " + MinCol(numbers, o));
		}



	}

	public int MinRow(int[][] arr, int r){
		int min = arr[r][0];
		for(int x = 0; x < arr[0].length; x++){
			for(int c = 0; c < arr[0].length; c++){
				if(arr[r][c] < min)
					min = arr[r][c];
			}
		}
		return(min);
	}

	public int MaxRow(int[][] arr, int r){
		int max = arr[r][0];
		for(int x = 0; x < arr[0].length; x++){
			for(int c = 0; c < arr[0].length; c++){
				if(arr[r][c] > max)
					max = arr[r][c];
			}
		}
		return(max);
	}

	public int MinCol(int[][] arr, int c){
		int minCol = arr[0][c];
		for(int x = 0; x < arr[0].length; x++){
			for(int r = 0; r < arr[0].length; r++){
				if(arr[r][c] < minCol)
					minCol = arr[r][c];
			}
		}
		return(minCol);
	}

	public int MaxCol(int[][] arr, int c){
		int maxCol = arr[0][c];
		for(int x = 0; x < arr[0].length; x++){
			for(int r = 0; r < arr[0].length; r++){
				if(arr[r][c] > maxCol)
					maxCol = arr[r][c];
			}
		}
		return(maxCol);
	}

	public static void main(String[] args){
		MultipleArray app = new MultipleArray();
	}
}