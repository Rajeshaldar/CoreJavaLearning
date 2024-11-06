package Static.Mobile;

public class Main {
	static void Company (String a)
	{
		System.out.println("Mobile name is "+a);
	}
	static void Company (int a)
	{
		System.out.println("The price is Rs "+a);
	}
	static void Company (int a, int b)
	{
		System.out.println("RAM is "+a+"GB"+" and VRAM is "+b+"GB");
	}
	static void Company (String x, int y)
	{
		System.out.println("Processor is "+x+" GEN "+y);
	}
	public static void main(String[] args) 
	{
		Company("Motorola edge 20");
		Company(29999);
		Company(8, 4);
		Company("Snapdragon", 778);
	}

}
