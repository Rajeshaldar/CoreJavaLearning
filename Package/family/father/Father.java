package family.father;

public class Father {
	private void Atm() {
		System.out.println("Father's ATM");
	}
	public void Cycle() {
		System.out.println("Father's cycle");
	}
	void Car() {
		System.out.println("Father's car");
	}
	protected void Money() {
		System.out.println("Father's money");
	}
	public static void main(String[] agrs) {
		Father F = new Father();
		F.Atm();
		F.Cycle();
		F.Money();
		F.Car();
	}

}
