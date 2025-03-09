class PostHeadMaster
{
	public static void deliver(String customername,String address)
	{
		System.out.println("I'll call Post master!");
		PostMaster.deliver(customername,address);
	}
}