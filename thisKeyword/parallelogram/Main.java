package parallelogram;

public class Main {
	int temp;
	Main(int base, int height){
		int temp = base * height;
		this.temp=temp;
	}
	
	public static void main(String[] agrs) {
		Main M = new Main(12, 22);
		System.out.println("Area of parallelogram is: "+M.temp);
	}

}
