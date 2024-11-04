package sector;

public class Main {
	double result;
	
	Main(double radius, double rad){
		double result = 0.5*radius*radius*rad;
		this.result=result;
	}
	public static void main(String[] args) {
		Main M = new Main(18.2, Math.toRadians(60));
		System.out.println("The area of sector: "+M.result);
	}
}
