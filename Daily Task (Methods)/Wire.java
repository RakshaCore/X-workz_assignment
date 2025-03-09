class Wire
{
public static void checkDamage()
	{
		System.out.println("<method 17>");
		getNewWire();
		cutWire();
	}
	public static void getNewWire()
	{
		System.out.println("<method 18>");
	}
	public static void cutWire()
	{
		System.out.println("<method 19>");
	}
	public static void checkWorking()
	{
		System.out.println("<method 20>");
		Gold.loseGold();
		Gold.giftGold();
	}
}