class RegionalPostOffice
{
	public static void deliver(String customername,String address)
	{
		System.out.println("I'll call Post-head master!");
		PostHeadMaster.deliver(customername,address);
	}
}