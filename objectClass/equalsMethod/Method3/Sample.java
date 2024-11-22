package objectClass.equalsMethod.Method3;

public class Sample {
	public static void main(String[] args) {
		Sample S = new Sample();
		Sample S1 = S;
		Sample S3 = S1;
		
		System.out.println(S3.equals(S1));
	}

}
