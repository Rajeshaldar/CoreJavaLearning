package objectClass.hashCodeMethod.overridden;

public class Sample {
	public int hashCode() {
		return 5959;
	}
	
	public static void main(String[] agrs) {
		Sample S = new Sample();
		// System.out.println(S); //cann't call implicitly
		System.out.println(S.hashCode()); //explicitly
	}

}
