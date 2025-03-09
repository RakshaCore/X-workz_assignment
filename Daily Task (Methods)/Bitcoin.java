class Bitcoin
{
public static void convertToINR()
	{
		System.out.println("<method 37>");
		Currency.convertAmount();
		Currency.checkCountry();
	}
	public static void getTransactionFee()
	{
		System.out.println("<method 38>");
	}
	public static void getInfo()
	{
		System.out.println("<method 39>");
		getTransactionFee();
		buyBitcoin();
		convertToINR();
	}
	public static void buyBitcoin()
	{
		System.out.println("<method 40>");
	}
	public static void main(String [] args)
	{
		getInfo();
	}
}