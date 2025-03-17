class Water
{
	String color;
	String source;
	boolean isCold;
	boolean isBrand;
	String brand;
	String state;
	
	public Water()
	{
		super();
	System.out.println("Water");
	}
	public Water(String color)
	{
	 this();
	 this.color=color;
	}
	public Water(String color,String source)
	{
	 this(color);
	 this.source=source;
	}
	public Water(String color,String source,boolean isCold)
	{
	this(color,source);
	this.isCold=isCold;
	}
	public Water(String color,String source,boolean isCold,boolean isBrand)
	{
	this(color,source,isCold);
	this.isBrand=isBrand;
	}
	public Water(String color,String source,boolean isCold,boolean isBrand,String brand)
	{
	this(color,source,isCold,isBrand);
	this.brand=brand;
	}
	public Water(String color,String source,boolean isCold,boolean isBrand,String brand,String state)
	{
	this(color,source,isCold,isBrand,brand);
	this.state=state;
	}
	
	public void display()
	{
		System.out.println("Water Details:\nColor: "+color);
		System.out.println("Source: "+source);
		System.out.println("Cold: "+isCold);
		System.out.println("Branded: "+isBrand);
		System.out.println("State: "+state);
		System.out.println("Brand: "+brand);
		System.out.println("------------------------");
	}
	
	
	
	
	
	
	
}