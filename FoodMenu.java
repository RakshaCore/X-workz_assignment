class FoodMenu
{
	public static int getPrice(String foodItem)
	{
	 if (foodItem=="Shawarma"){return 150;}
	 else if(foodItem=="Biryani"){return 100;}
	 else if(foodItem=="Momos"){return 100;}
	 else if(foodItem=="Cold Coffee"){return 90;}
	 else if(foodItem=="Ckn Pizza"){return 250;}
	 else if(foodItem=="Pav Bhaji"){return 50;}
	 else if(foodItem=="Samosa"){return 10;}
	 else if(foodItem=="Mysore Masala Dosa"){return 45;}
	 else if(foodItem=="Chole Bhature"){return 60;}
	 else if(foodItem=="Chikku Juice"){return 35;}
	 else if(foodItem=="Veg Fried Rice"){return 60;}
	 else if(foodItem=="Paneer Fried Rice"){return 70;}
	 else if(foodItem=="Gobi Rice"){return 65;}
	 else if(foodItem=="Chicken Fried Rice"){return 100;}
	 else if(foodItem=="Masala Puri"){return 35;}
	 else if(foodItem=="Omlette"){return 25;}
	 else if(foodItem=="Bread Omlette"){return 35;}
	 else if(foodItem=="Kurkure"){return 10;}
	 else if(foodItem=="Meals"){return 50;}
	 else if(foodItem=="Maharaja Thali"){return 250;}
	 else if(foodItem=="Friends Combo"){return 500;}
	 else return -1;
	}
}