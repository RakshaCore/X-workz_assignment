class Courier
{
	public static void pickUp(String item)
	{
	System.out.println(item+" packed and out to station");
	Station.send(item);
	}
}