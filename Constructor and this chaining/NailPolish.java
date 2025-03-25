class NailPolish
{
	String color;
	String brand;
	String type;
	int price;
	boolean isLongLasting;
	int quality;
	
	public NailPolish()
	{
	super();
	System.out.println("Nail Polish");
	}
	public NailPolish(String color)
	{
	this();
	this.color=color;
	}
	public NailPolish(String color,String brand)
	{
	this(color);
	this.brand=brand;
	}
	public NailPolish(String color,String brand,String type)
	{
	this(color,brand);
	this.type=type;
	}
	public NailPolish(String color,String brand,String type,int price)
	{
	this(color,brand,type);
	this.price=price;
	}
	public NailPolish(String color,String brand,String type,int price,boolean isLongLasting)
	{
	this(color,brand,type,price);
	this.isLongLasting=isLongLasting;
	}
	public NailPolish(String color,String brand,String type,int price,boolean isLongLasting,int quality)
	{
	this(color,brand,type,price,isLongLasting);
	this.quality=quality;
	}
	
	public void display()
	{
		System.out.println("Nail Polish Details:\n Color"+color);
		System.out.println("Brand"+brand);
		System.out.println("Type"+type);
		System.out.println("Price"+price);
		System.out.println("Is Long Lasting?"+isLongLasting);
		System.out.println("Quality"+quality);
		
	}
	
}