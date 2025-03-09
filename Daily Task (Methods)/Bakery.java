class Bakery
{
	public static void buy(String itemName,int quantity)
	{
		System.out.println("Item Name is "+itemName+"and the Quantity of the Item is "+quantity);
	}
	public static void open(boolean yesorno)
	{
		System.out.println("Is the shop Open?- "+yesorno);
	}
	public static void close(boolean yesorno)
	{
		System.out.println("Is the shop Close?- "+yesorno);
	}
	public static void owner(String name)
	{
		System.out.println("The Name of the Owner is "+name);
	}
	public static void cashier(String name)
	{
		System.out.println("The name of the cashier is"+name);
	}
	public static void main(String[] args)
	{
		buy("Cake",1);
		open(true);
		close(false);
		owner("Raksha");
		cashier("Raksha");
	}
}