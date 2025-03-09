class RunnerCollab
{
	public static void main(String[] args)
	{
	String number="7829247724";
	String name=PhoneBook.extractName(number);
	System.out.println(number+" This number belongs tooo--->"+name);
	
	String companyName="Netflix";
	String ownerName=OwnerList.fetchOwner(companyName);
	System.out.println(ownerName+" owns "+companyName);
	
	String foodItem="Shawarma";
	int price=FoodMenu.getPrice(foodItem);
	System.out.println(foodItem+" costs "+price+" rs only.");
	
	int accountNumber=10000012;
	double balance=BankAccount.getBalance(accountNumber);
	System.out.println(accountNumber+" has "+balance+" Rs only!");
	
	String source="Manglore";
	int fee=SourceFee.getPrice(source);
	System.out.println(source+" costs "+fee+" rs only!!!");
	
	String playerName="CR7";
	boolean status=ExistenceStatus.isAliveOrNot(playerName);
	if (status==true)
		System.out.println("Hurray!!!"+playerName+" is Aliveeee!");
	else if (status== false)
		System.out.println("Sadly "+playerName+ "is no more between us!");
	else 
		System.out.println("Whoss he?");
	}
	
	
}