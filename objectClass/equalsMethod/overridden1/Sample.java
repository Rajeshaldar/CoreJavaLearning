package objectClass.equalsMethod.overridden1;


public class Sample {
    public boolean equals(Object obj) {
        return true;
    }
	public static void main(String[] args) {
		Sample S = new Sample();
		System.out.println(S.equals(S));
	}
}
