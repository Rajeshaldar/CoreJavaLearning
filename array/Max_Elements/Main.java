package array.Max_Elements;

public class Main {
	public static void main(String[] args) {
		int arr [] = {10,20,3};
		int max = arr[0];
		
		for(int i=0; i<=arr.length-1; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
