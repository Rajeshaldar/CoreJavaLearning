package typeCasting.Class_type_casting.DownCasting.Father;

public class Main {
	public static void main(String[] args) {
		Father F = new Son();	// Upcasting
//		F.Atm();
		Son S = (Son) F; // downcasting
		S.KTM();
	}

}
