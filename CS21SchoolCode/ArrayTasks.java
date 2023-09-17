public class ArrayTasks {
	public ArrayTasks(){
//Number 1
	int[] array1 = new int[29];
/*
	for(int x=0; x < array1.length; x++)
		array1[x]=(int)(Math.random()*30)+5;

//Number 2
	for(int x=0; x < array1.length; x++)
		if(array1[x] % 2 == 0){
			array1[x] *= 3;
		}

//Number 3
	int storedValue = 0;
		if(b % 2 == 1){
			storedValue = array1[b];
			array1[b] = array1[b-1];
			array1[b-1] = storedValue;
		}
	}

//Number 4
	int max = array[0]
	for(int x=0; x < array1.length; x++){
		if(array1[x] > max)
			max = array1[x]
		}

//Number 5
	int min = array[0]
	for(int x=0; x < array1.length; x++){
		if(array1[x] < min)
			min = array1[x]
		}

//Number 6
	int maxeven = array[0]
	for(int x=0; x < array1.length; x++){
		if(array1[x] > maxeven && array1[x] % 2 == 0)
			maxeven = array1[x]
		}
//Number 7
	int smalleven = array[0]
	for(int x=0; x < array1.length; x++){
		if(array1[x] < smalleven && array1[x] % 2 == 0)
			smalleven = array1[x]
		}
//Number 8
	int maxodd = array[0]
	for(int x=0; x < array1.length; x++){
		if(array1[x] > maxodd && array1[x] % 2 == 1)
			maxodd = array1[x]
		}
//Number 9
	int minodd = array[0]
	for(int x=0; x < array1.length; x++){
		if(array1[x] < minodd && array1[x] % 2 == 1)
			minodd = array1[x]
		}
*/
//Number 10
	int sum = 0;
	for(int x=0; x < array1.length; x++)
		sum += array1[x];

//Number 11
	int sumeven = 0;
	for(int x=0; x < array1.length; x++)
		if(array1[x] % 2 == 0){
			sumeven += array1[x];
		}
//Number 12
	int sumodd = 0;
	for(int x=0; x < array1.length; x++)
		if(array1[x] % 2 == 1){
			sumodd += array1[x];
		}
//Number 13
	for(int x=0; x < array1.length; x++)
		if(x % 3 == 1)
			array1[x] = array1[x] * -1;
//Number 14
	for(int x=0; x < array1.length; x++){
		array1[x] = array1[x + 1];
		array1[array1.length - 1] = array1[0];
//Number 15
	for(int x=0; x < array1.length; x++){
		array1[x] = array1[x - 1];
		array1[array1.length - 1] = array1[0];

		}


}

	public static void main(String[] args){
		ArrayTasks app = new ArrayTasks();
	}
}