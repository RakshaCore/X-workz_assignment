class SourceFee
{
	public static int getPrice(String source)
	{
		if(source=="Banglore"){return 1000;}
		else if(source=="Manglore"){return 800;}
		else if(source=="Mysore"){return 750;}
		else if(source=="Pune"){return 1500;}
		else if(source=="Chennai"){return 1200;}
		else if(source=="Kolkata"){return 2000;}
		else if(source=="Goa"){return 500;}
		else if(source=="Delhi"){return 600;}
		else if(source=="Udupi"){return 200;}
		else if(source=="Hubli"){return 300;}
		else if(source=="Shivamoga"){return 700;}
		else if(source=="Ahmedabad"){return 1750;}
		else if(source=="Jaipur"){return 1500;}
		else if(source=="Jammu"){return 3000;}
		else if(source=="Kochi"){return 800;}
		else if(source=="Hyderabad"){return 100;}
		else if(source=="Coimbatore"){return 999;}
		else if(source=="Belgam"){return 450;}
		else if(source=="Udaipur"){return 2000;}
		else if(source=="Vijayawada"){return 450;}
		else return -1;
	}
}