package rectangle;

public class Main {
	int result;
	Main(int width, int height){
		int result = width*height;
		this.result=result;
		
	}
	public static void main(String[] args) {
		Main M = new Main(17, 22);
		System.out.println("Area of rectangle is: "+M.result);
	}

}
