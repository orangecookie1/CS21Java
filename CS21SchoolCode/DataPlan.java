public class DataPlan{
	public DataPlan(){
		int gigs = (int)(Math.random() * 30) + 1;
		System.out.println("Number of gigabytes used is " + gigs + ".");

		double planA = 19.99;
		double planB = 29.99;
		double planC = 49.99;
		double planD = 69.99;
		double planE = 89.99;

		int extraA = 0;
		int extraB = 0;
		int extraC = 0;
		int extraD = 0;
		int extraE = 0;

		if(gigs > 2){
			extraA = gigs - 2;
			planA = (extraA *  20) + planA;
		}

		if(gigs > 5){
			extraB = gigs - 5;
			planB = (extraB *  20) + planB;

		}
		if(gigs > 10){
			extraC = gigs - 10;
			planC = (extraC *  20) + planC;
		}
		if(gigs > 16){
			extraD = gigs - 16;
			planD = (extraD *  20) + planD;
		}

		System.out.println("Cost for Plan A with " + extraA + " extra GBs used is $" + planA);
		System.out.println("Cost for Plan B with " + extraB + " extra GBs used is $" + planB);
		System.out.println("Cost for Plan C with " + extraC + " extra GBs used is $" + planC);
		System.out.println("Cost for Plan D with " + extraD + " extra GBs used is $" + planD);
		System.out.println("Cost for Plan E is $" + planE + "\n");

		if(planA < planB && planA < planC && planA < planD && planA < planE){
			System.out.println("The least expensive plan is Plan A for a cost of $" + planA);
			}

		if(planB < planA && planB < planC && planB < planD && planB < planE){
			System.out.println("The least expensive plan is Plan B for a cost of $" + planB);
			}

		if(planC < planA && planC < planB && planC < planD && planC < planE){
			System.out.println("The least expensive plan is Plan C for a cost of $" + planC);
			}

		if(planD < planA && planD < planB && planD < planC && planD < planE){
			System.out.println("The least expensive plan is Plan D for a cost of $" + planD);
			}

		if(planE < planA && planE < planB && planE < planC && planE < planD){
			System.out.println("The least expensive plan is Plan E for a cost of $" + planE);
	  		}

	}

	public static void main(String[] args){
		DataPlan app = new DataPlan();
	}

}