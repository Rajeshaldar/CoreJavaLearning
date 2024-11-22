package objectClass.hashCodeMethod;

public class Sample {
	public static void main(String[] agrs) {
		Sample S = new Sample();
		// System.out.println(S); //cann't call implicitly
		System.out.println(S.hashCode()); //explicitly
	}
}
