package inheritance.Multilevel.Building;

public class ConferenceRoom extends Office{
	int chair = 100;
	public void Info() {
		System.out.println("Address: " + address);
		System.out.println("Floor :" + floor + "st");
		System.out.println("Total Desk: " + workdesk);
		System.out.println("Total chair: " + chair);
	}

}
