class WaterBall
{
	String brand;
	String color;
	double volume;
	boolean isReusable;
	int weight;
	double price;
	
	public WaterBall()
	{
	super();
	System.out.println("Waterball");
	}
	public WaterBall(String brand)
	{
	this();
	this.brand=brand;
	}
	public WaterBall(String brand,String color)
	{
	this(brand);
	this.color=color;
	}
	public WaterBall(String brand,String color,double volume)
	{
	this(brand,color);
	this.volume=volume;
	}
	public WaterBall(String brand,String color,double volume,boolean isReusable)
	{
	this(brand,color,volume);
	this.isReusable=isReusable;
	}
	public WaterBall(String brand,String color,double volume,boolean isReusable,int weight)
	{
	this(brand,color,volume,isReusable);
	this.weight=weight;
	}
	public WaterBall(String brand,String color,double volume,boolean isReusable,int weight,double price)
	{
	this(brand,color,volume,isReusable,weight);
	this.price=price;
	}
	public void display() {
        System.out.println("\nWATERBALL DETAILS:");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Volume: " + volume + " liters");
        System.out.println("Reusable: " + isReusable);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Price:  " + price);
        System.out.println("------------------------");
    }
	
}