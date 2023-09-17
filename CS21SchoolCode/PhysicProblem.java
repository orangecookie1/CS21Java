public class PhysicProblem{

	public PhysicProblem(){
	double so = 12.0;
	double t = 10.0;
	double vo = 3.5;
	double a = 9.8;
	double s = so + (vo * t)+(((t*t)*a)/2);
	System.out.println(s);


	}

	public static void main(String[] args){
		PhysicProblem app = new PhysicProblem();
	}
}