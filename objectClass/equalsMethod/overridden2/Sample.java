package objectClass.equalsMethod.overridden2;

public class Sample {
    public boolean equals(Object obj) {
        return true;
    }
	public static void main(String[] args) {
		Sample S = new Sample();
		Sample S1 = new Sample();
		System.out.println(S1.equals(S));
	}


}
