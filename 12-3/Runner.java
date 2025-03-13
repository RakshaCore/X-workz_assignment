class Runner
{
	public static void displayFaces()
	{
		Face f1= new Face("Round","Fair","Brown");
		Face f2= new Face("Oval","Tan","Blue");
		Face f3= new Face("Square","Dark","Green");
		Face f4= new Face("Heart","Pale","Hazel");
		Face f5= new Face("Diamond","Olive","Brown");
		
		Face[] faces={f1,f2,f3,f4,f5};
		
		for(int i=0;i<faces.length;i++)
		{
			System.out.println("Shape: "+faces[i].shape+",Color: "+faces[i].color+",Eye Color: "+faces[i].eyeColor);
		}
	}
	
	
	public static void displaySagar()
	{
		Sagar s1=new Sagar("Sagar Sharma","Punjab","Study");
		Sagar s2=new Sagar("Sagar Reddy","Chennai","Cricket");
		Sagar s3=new Sagar("Sagar Shetty","Mangluru","Partying");
		Sagar s4=new Sagar("Sagar Kamath","Kumta","Pray");
		Sagar s5=new Sagar("Sagar ","Kerala","Badminton");
	
		Sagar[] sagars={s1,s2,s3,s4,s5};
		for (int i = 0; i < sagars.length; i++) 
		{
			System.out.println("Name: " + sagars[i].name + ", City: " + sagars[i].city +  ", Hobby: " + sagars[i].hobby);
		}
	}
	
	public static void displayBar()
	{
		Bar b1=new Bar("Sky Louge","Mumbai","Cocktails");
		Bar b2 =new Bar("The Irish House","Banglore","Craft Beer");
		Bar b3=new Bar("Monkey Bar","Delhi","Fusion Drinks");
		Bar b4=new Bar("Toit","Chennai","Handcrafted beer");
		Bar b5=new Bar("The Grid","Kolkata","Signature Cocktails");
		
		Bar[] bars={b1,b2,b3,b4,b5};
		for (Bar bar:bars)
		{
			System.out.println("Name: "+bar.name+",Location: "+bar.location+", Speciality: "+bar.specialty);
		}
	
	}
	public static void displayChain()
	{
		Chain c1=new Chain("Gold",20,true);
		Chain c2=new Chain("Silver",22,true);
		Chain c3=new Chain("Platinum",25,false);
		Chain c4=new Chain("Gold",25,true);
		Chain c5=new Chain("Silver",20,false);
		
		Chain[] chains={c1,c2,c3,c4,c5};
		for(Chain chain:chains)
		{
			 System.out.println("Material: " + chain.material + ", Length: " + chain.length + " cm" + ", Is Locket Present: " + chain.hasLocket);
		}
	}
	
	public static void displayMagnet()
	{
		Magnet m1=new Magnet("Neodymium",13000,false);
		Magnet m2=new Magnet("Ferrite",4000,false);
		Magnet m3=new Magnet("Alnico",1200,false);
		Magnet m4=new Magnet("Electromagnet",2000,true);
		Magnet m5=new Magnet("Samarium Colbalt",11000,false);
		
		Magnet[] magnets={m1,m2,m3,m4,m5};
		for(Magnet magnet:magnets)
		{
			  System.out.println("Type: " + magnet.type + ", Strength: " + magnet.strength + " Gauss" + ", Is Electromagnetic: " + magnet.isElectromagnetic);		}
	}
	
	public static void displayAnklet() {
    Anklet a1 = new Anklet("Silver", 15, "Beaded");
    Anklet a2 = new Anklet("Gold", 20, "Engraved");
    Anklet a3 = new Anklet("Platinum", 18, "Plain");
    Anklet a4 = new Anklet("Copper", 12, "Braided");
    Anklet a5 = new Anklet("Brass", 10, "Patterned");

    Anklet[] anklets = {a1, a2, a3, a4, a5};

    for (Anklet anklet : anklets) {
        System.out.println("Material: " + anklet.material + ", Weight: " + anklet.weight + "g" + ", Design Type: " + anklet.designType);
    }
	public static void displayUsers()
{
	WhatsApp user1= new WhatsApp("Adnan","Bumblebee 🐝",true);
	WhatsApp user2= new WhatsApp("Vaibhav Balgi","Hard Times Create Strong Men😎",true);
	WhatsApp user3= new WhatsApp("Deepika","Udne ka waqt aya toh, pinjre se mohabbat hogayi..",false);
	WhatsApp user4= new WhatsApp("Kavya","chatpat dhudum😵‍💫🥴",true);
	WhatsApp user5= new WhatsApp("Raksha","We met for a reason either you are a BLESSING or a LESSON ✨️",true);
	
	WhatsApp[] users = {user1, user2, user3, user4, user5};

        for (WhatsApp user : users) {
            System.out.println("User: " + user.userName +", Status: \"" + user.status + "\"" + ", Has Profile Picture: " + (user.hasProfilePicture ? "Yes 🖼️" : "No ❌"));
        }

}

public static void displayHarpicVariants() {
        Harpic h1 = new Harpic("Power Plus", "Lemon", 9);
        Harpic h2 = new Harpic("10X Max Clean", "Ocean Fresh", 8);
        Harpic h3 = new Harpic("Disinfectant", "Lavender", 3);
        Harpic h4 = new Harpic("Bathroom Cleaner", "Rose", 4);
        Harpic h5 = new Harpic("Stain Blaster", "Citrus", 10);

        Harpic[] harpics = {h1, h2, h3, h4, h5};

        for (Harpic harpic : harpics) {
            System.out.println("Variant: " + harpic.variant + ", Fragrance: " + harpic.fragrance + ", Acidity Level: " + harpic.acidityLevel + "/10");
        }
    }
	public static void displayChargers() {
        Charger c1 = new Charger("Samsung", "Fast Charger", 25);
        Charger c2 = new Charger("Apple", "MagSafe Charger", 20);
        Charger c3 = new Charger("OnePlus", "Warp Charger", 65);
        Charger c4 = new Charger("Xiaomi", "Turbo Charger", 33);
        Charger c5 = new Charger("Anker", "PowerPort", 45);

        Charger[] chargers = {c1, c2, c3, c4, c5};

        for (Charger charger : chargers) {
            System.out.println("Brand: " + charger.brand +", Type: " + charger.type +", Power Output: " + charger.powerOutput + "W");
        }
    }

	public static void displayChats() {
        Chat c1 = new Chat("Deepika", "Raksha", 1200);
        Chat c2 = new Chat("Raksha", "Viabhav B", 95);
        Chat c3 = new Chat("Raksha", "Adnan", 50);
        Chat c4 = new Chat("Bhoomika", "Deepika", 180);
        Chat c5 = new Chat("Makwin", "Raksha", 300);

        Chat[] chats = {c1, c2, c3, c4, c5};

        for (Chat chat : chats) {
            System.out.println("Sender: " + chat.sender +", Receiver: " + chat.receiver + ", Messages Exchanged: " + chat.messageCount);
        }
    }

	public static void displayFestivals() {
        Festival f1 = new Festival("Diwali", 5, "Hinduism");
        Festival f2 = new Festival("Eid-ul-Fitr", 1, "Islam");
        Festival f3 = new Festival("Christmas", 1, "Christianity");
        Festival f4 = new Festival("Guru Nanak Jayanti", 1, "Sikhism");
        Festival f5 = new Festival("Navratri", 9, "Hinduism");

        Festival[] festivals = {f1, f2, f3, f4, f5};

        for (Festival festival : festivals) {
            System.out.println("Festival: " + festival.name +", Duration: " + festival.noOfDays + " days" +  ", Religion: " + festival.religion);
        }
    }3
}

	public static void displayRatPoison() {
        RatPoison r1 = new RatPoison("Anticoagulant", "Internal bleeding", 8);
        RatPoison r2 = new RatPoison("Neurotoxin", "Paralysis", 9);
        RatPoison r3 = new RatPoison("Bromethalin", "Brain swelling", 10);
        RatPoison r4 = new RatPoison("Cholecalciferol", "Kidney failure", 7);
        RatPoison r5 = new RatPoison("Zinc Phosphide", "Respiratory failure", 9);

        RatPoison[] poisons = {r1, r2, r3, r4, r5};

        for (RatPoison poison : poisons) {
            System.out.println("Type: " + poison.type +", Effect: " + poison.effect + ", Toxicity Level: " + poison.toxicityLevel);
        }
    }
}


	public static void main(String[] args)
	{
		{
		displayFaces();
		displaySagar();
		displayBar();
		displayChain();
		displayMagnet();
		displayAnklet();
		displayRatPoison();
		displayUsers();
		displayHarpicVariants();
		displayChargers();
		displayChats();
		displayFestivals();
	}
}