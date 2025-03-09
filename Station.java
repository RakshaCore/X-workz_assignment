class Station
{
	public static void send(String item)
	{
		System.out.println("Item "+item+"  has arrived the Station and out for Delivery!");
		DeliveryGuy.accept(item);
	}
}