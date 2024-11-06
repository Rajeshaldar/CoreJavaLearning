package Static.WeatherReport;

public class Main {
	static void Info(String L)
	{
		System.out.println("Location: "+L);
	}
	static void Info(double T)
	{
		System.out.println("Temperature: "+T);
	}
	static void Info(int A)
	{
		System.out.println("AQI: "+A);
	}
	static void Info(String D, String E)
	{
		System.out.println("Day: "+E+" "+D);
	}
	public static void main(String[] args) 
	{
		Info("Kolkata");
		Info(30.0);
		Info(67);
		Info("Friday","Sunny");
	}
}
