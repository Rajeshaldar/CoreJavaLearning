package objectClass.equalsMethod.overridden3;

public class Sample {
    public boolean equals(Object obj) {
        return true;
    }
	public static void main(String[] args) {
		Sample S = new Sample();
		Sample S1 = S;
		System.out.println(S1.equals(S));
	}

}
