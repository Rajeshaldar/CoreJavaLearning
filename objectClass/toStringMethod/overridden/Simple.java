package objectClass.toStringMethod.overridden;

public class Simple {
	
    public String toString() {
        return "I Love Java";
    }
	public static void main(String[] agrs) {
		Simple S = new Simple();
		
		System.out.println(S); //implicitly
		System.out.println(S.toString()); //explicitly
		
	}

}
