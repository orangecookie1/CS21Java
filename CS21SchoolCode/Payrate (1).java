public class Payrate{
	public Payrate(){
		double pay = (int)(Math.random() * 14) + 12;
		pay = pay * 100;
		pay = (int)pay;
		pay = pay/100;
		double pay2 = (int)(Math.random() * 10.0) + 6.0;
		pay2 = pay2 / 100;
		pay2 = pay2 * 5;
		double payhrs =  pay + pay2;
		System.out.println("Pay per hour: $" + payhrs);

		int hrs = (int)(Math.random() * 20) + 46;

		System.out.println("Hours worked: " + hrs);

		int hrs2 = hrs - 40;
		double payhrs2 = payhrs * 1.5;

		int hrs3 = hrs - 50;
		double payhrs3 = payhrs * 2;

		int hrs4 = hrs - 60;
		double payhrs4 = payhrs * 3;

		System.out.println("1.5 times pay pay: " + payhrs2);
		System.out.println("Double pay: "  + payhrs3);
		System.out.println("Triple pay: "  + payhrs4);

		if(hrs <= 40){
			double pay40 = hrs * payhrs;
			}
		if(hrs>40 && hrs < 50){
			double pay4050 = (hrs2 * payhrs2) + (40 * payhrs);
			System.out.println(pay4050);
			}
		if(hrs>50 && hrs < 60){
			double pay5060 = (10 * payhrs2) + (40 * payhrs) + (hrs3 * payhrs3);
			System.out.println(pay5060);
			}
		if(hrs>60){
			double pay60 = (10 * payhrs2) + (40 * payhrs) + (10 * payhrs3) + (hrs4 * payhrs4);
			System.out.println(pay60);
			}

	}

	public static void main(String[] args){
		Payrate app = new Payrate();{
			}
		}

}