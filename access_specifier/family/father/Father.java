package family.father;

public class Father {
	private void ATM() {
		System.out.println("ATM");
	}
	public void Cycle() {
		System.out.println("Cycle");
	}
	void Car() {
		System.out.println("Car");
	}
	protected void Money() {
		System.out.println("Money");
	}
	public static void main (String[] args) {
		Father F = new Father();
		F.ATM();
		F.Cycle();
		F.Car();
		F.Money();
	}
}

