package logical.pattern.square_alphabet;

public class Main {
	public static void main(String[] agrs) {
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				if(j==3) {
					System.out.print("A B C");
				}
			}
			System.out.println();
		}
	}

}
