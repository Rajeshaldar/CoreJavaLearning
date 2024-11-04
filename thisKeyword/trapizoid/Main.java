package trapizoid;

public class Main {
	double result;
	
	//Constructor
	Main(int a, int b, int height){
		double result = 0.5*(a+b)*height;
		this.result=result;
	}
	public static void main(String[] agrs) {
		Main M = new Main(5, 7, 12);
		System.out.println("Area of trapizoid is: "+ M.result);
	}
	

}
