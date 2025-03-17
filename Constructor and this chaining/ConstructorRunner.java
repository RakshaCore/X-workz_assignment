class ConstructorRunner
{
	public static void main(String[] args)
	{
		Water w1=new Water();
		Water w2=new Water("Green");
		Water w3=new Water("Green","Lake");
		Water w4=new Water("Brown","Well",true);
		Water w5=new Water("Clear","Spring",false);
		Water w6=new Water("Clear","Glacier",true,true,"Bisleri");
		Water w7=new Water("Brown","Pond",false,false,"None","Liquid");
	
		w1.display();
		w2.display();
		w3.display();
		w4.display();
		w5.display();
		w6.display();
		w7.display();
		
		
		NailPolish nailPolish1=new NailPolish();
		NailPolish nailPolish2=new NailPolish("Red");
		NailPolish nailPolish3=new NailPolish("Pink","Lakme");
		NailPolish nailPolish4=new NailPolish("Blue","Maybelline","Matte");
		NailPolish nailPolish5=new NailPolish("Black","MAC","Glossy",300);
		NailPolish nailPolish6=new NailPolish("Green","Nykaa","Gel",350,true);
		NailPolish nailPolish7=new NailPolish("White","Revlon","Shiny",200,true,15);
		
		nailPolish1.display();
		nailPolish2.display();
		nailPolish3.display();
		nailPolish4.display();
		nailPolish5.display();
		nailPolish6.display();
		nailPolish7.display();
		
		
		Gun gun1=new Gun();
		Gun gun2=new Gun("AK-47");
		Gun gun3=new Gun("M4A1","Colt");
		Gun gun4=new Gun("Glock 19","Glock",9.0);
		Gun gun5=new Gun("Desert Eagle","Magnum Research",12.7,7);
		Gun gun6=new Gun("MP5", "Heckler & Koch", 9.0, 30, true);
		Gun gun7=new Gun("Barrett M82", "Barrett Firearms", 12.7, 10, false, 14);
		
		gun1.display();
        gun2.display();
        gun3.display();
        gun4.display();
        gun5.display();
        gun6.display();
        gun7.display();
		
		
		WaterBall wb1 = new WaterBall();
        WaterBall wb2 = new WaterBall("AquaPure");
        WaterBall wb3 = new WaterBall("BlueWave", "Blue");
        WaterBall wb4 = new WaterBall("EcoDrop", "Green", 1.5);
        WaterBall wb5 = new WaterBall("HydroFlow", "Red", 2.0, true);
        WaterBall wb6 = new WaterBall("PureSpring", "White", 3.0, false, 500);
        WaterBall wb7 = new WaterBall("CrystalClear", "Transparent", 1.0, true, 300, 2.99);

        wb1.display();
        wb2.display();
        wb3.display();
        wb4.display();
        wb5.display();
        wb6.display();
        wb7.display();
		
		Bucket bucket1 = new Bucket("Aqua Max","Blue","Large",1,299,2000);
        
        System.out.println("Bucket 1 Details :");
        bucket1.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Bucket bucket2 = new Bucket("Eco Carry","Green","Medium",2,399,1500);
        
        System.out.println("Bucket 2 Details :");
        bucket2.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Bucket bucket3 = new Bucket("Steel Guard","Silver","Extra Large",1,599,2500);
        
        System.out.println("Bucket 3 Details :");
        bucket3.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Bucket bucket4 = new Bucket("Plastic King","Red","Small",3,199,1000);
        
        System.out.println("Bucket 4 Details :");
        bucket4.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Bucket bucket5 = new Bucket("Premium Tough","Black","Large",2,499,2200);
        
        System.out.println("Bucket 5 Details :");
        bucket5.display();
        
        System.out.println("----------------------\n--------------------------");
        
        Bucket bucket6 = new Bucket("Classic Bucket","White","Medium",4,299,1800);
        
        System.out.println("Bucket 6 Details :");
        bucket6.display();
        
        System.out.println("----------------------\n--------------------------");
		
Color color1 = new Color("Holi Blitzer","Purple","Cool",1,199,80);
		
		System.out.println("Color 1 Details :");
		color1.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Color color2 = new Color("Splash Master","Red","Warm",2,299,90);
		
		System.out.println("Color 2 Details :");
		color2.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Color color3 = new Color("Aqua Glow","Blue","Cool",1,399,75);
		
		System.out.println("Color 3 Details :");
		color3.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Color color4 = new Color("Neon Burst","Green","Cool",3,499,85);
		
		System.out.println("Color 4 Details :");
		color4.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Color color5 = new Color("Firestorm","Orange","Warm",1,599,95);
		
		System.out.println("Color 5 Details :");
		color5.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Color color6 = new Color("Sunflare","Yellow","Warm",2,699,88);
		
		System.out.println("Color 6 Details :");
		color6.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Color color7 = new Color("Firestorm","Orange","Warm",1,599,95);
		
		System.out.println("Color 7 Details :");
		color7.display();
		
		System.out.println("----------------------\n--------------------------");
		Pichkari pichkari1 = new Pichkari("Splash Blaster","Blue","Medium",1,299,2);
		
		System.out.println("Pichkari 1 Details :");
		pichkari1.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Pichkari pichkari2 = new Pichkari("Aqua Warrior","Yellow","Large",2,400,2);
		
		System.out.println("Pichkari 2 Details :");
		pichkari2.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Pichkari pichkari3 = new Pichkari("Holi Hurricane","Neon Green","Extra Large",1,599,3);
		
		System.out.println("Pichkari 3 Details :");
		pichkari3.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Pichkari pichkari4 = new Pichkari("Rainbow Shooter","Multicolor","Medium",1,399,2);
		
		System.out.println("Pichkari 4 Details :");
		pichkari4.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Pichkari pichkari5 = new Pichkari("Water Beast","Orange","Large",2,699,2);
		
		System.out.println("Pichkari 5 Details :");
		pichkari5.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Pichkari pichkari6 = new Pichkari("Holi Blitzer","Purple","Small",1,199,1);
		
		System.out.println("Pichkari 6 Details :");
		pichkari6.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Pichkari pichkari7 = new Pichkari("Turbo Soaker","Pink","Large",1,349,1);
		
		System.out.println("Pichkari 7 Details :");
		pichkari7.display();
		
		System.out.println("----------------------\n--------------------------");
		Egg egg1 = new Egg("Protein Rich","Brown","Large",1,10,60);
		
		System.out.println("Egg 1 Details :");
		egg1.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Egg egg2 = new Egg("High Omega-3","White","Medium",2,15,55);
		
		System.out.println("Egg 2 Details :");
		egg2.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Egg egg3 = new Egg("Vitamin Packed","Speckled","Small",6,50,45);
		
		System.out.println("Egg 3 Details :");
		egg3.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Egg egg4 = new Egg("Low Cholesterol","Blue","Extra Large",12,120,70);
		
		System.out.println("Egg 4 Details :");
		egg4.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Egg egg5 = new Egg("Organic","Brown","Jumbo",30,250,75);
		
		System.out.println("Egg 5 Details :");
		egg5.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Egg egg6 = new Egg("Sunflare","Yellow","Warm",2,699,88);
		
		System.out.println("Egg 6 Details :");
		egg6.display();
		
		System.out.println("----------------------\n--------------------------");
		
		Egg egg7 = new Egg("Free Range","White","Large",6,60,65);
		
		System.out.println("Egg 7 Details :");
		egg7.display();
		
		System.out.println("----------------------\n--------------------------");
		
	}
}