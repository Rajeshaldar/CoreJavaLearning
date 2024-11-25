package stringClassMethod.reverseString;

public class ReverseString {
	public static void Sample(String S) {
		String rev ="";
		for(int i=0; i<S.length(); i++) {
			char ch = S.charAt(i);
			rev = ch+rev;
		}
		System.out.println(rev);
	}
}
