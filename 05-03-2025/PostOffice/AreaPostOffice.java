class AreaPostOffice
{
	public static void deliver(String customername,String address)
	{
		System.out.println("Lets call Sub-Regional Post office about your Letter!");
		SubRegionalPostOffice.deliver(customername,address);
	}
}