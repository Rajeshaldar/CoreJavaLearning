package logical.Loop.If.Leap_Year;

public class Operation {
	public void LeapYear(int year) {
		if ((year%4==0 && year%100!=0)||(year%400==0)) {
			System.out.println(year +" is a leap year");
		}
		else {
			System.out.println(year+" is not a leap year");
		}
	}

}
