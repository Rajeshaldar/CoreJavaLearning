package array.SummationOfElements;

public class Main {
	public static void main(String[] args) {
		int arr [] = {10,20,3};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
}
