class Brand
{
	public static void getBrandName()
	{
		System.out.println("<method 5>");
		TrafficSignal.startTimer();
		setBrandReputation();
		getBrandDetails();
	}
	public static void setBrandReputation()
	{
		System.out.println("<method 6>");
		TrafficSignal.stopSignal();
	}
	public static void launchNewProduct()
	{
		System.out.println("<method 7>");
	}
	public static void getBrandDetails()
	{
		System.out.println("<method 8>");
	}
}