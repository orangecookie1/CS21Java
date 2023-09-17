public class SecondToDay{

	public SecondToDay(){

		int ts = (int)(Math.random() * 1000000) + 500;

		System.out.println("Total seconds: " + ts);

		int days = ts/86400;
		ts = ts - (days * 86400);

		int hrs = ts/3600;
		ts = ts - (hrs * 3600);

		int mins = ts/60;
		ts = ts - (mins * 60);

		int sec = ts;

		System.out.println("Days: " + days);
		System.out.println("Hours: " + hrs);
		System.out.println("Minutes: " + mins);
		System.out.println("Seconds: " + sec);


	}

	public static void main(String[] args){
		SecondToDay app = new SecondToDay();
	}
}
