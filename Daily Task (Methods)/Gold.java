class Gold
{
public static void buyGold()
	{
		System.out.println("<method 13>");
		Pineapple.slicePineapple();
	}
	public static void sellGold()
	{
		System.out.println("<method 14>");
		Pineapple.peelPineapple();
	}
	public static void giftGold()
	{
		System.out.println("<method 15>");
		buyGold();
		sellGold();
	}
	public static void loseGold()
	{
		System.out.println("<method 16>");
	}
}