package stringClassMethod.palindromeString;

public class Sample {
	public void PalindromeString(String S) {
		String rev ="";
		for(int i=0; i<=S.length()-1; i++) {
			char ch = S.charAt(i);
			rev = ch+rev;
		}
		System.out.println(rev);
		boolean b = S.equals(rev);//true or false
		if(b==true) {
			System.out.println("Is a palindrome String");
		}else {
			System.out.println("Is not a palindrome String");
		}
	}
}

