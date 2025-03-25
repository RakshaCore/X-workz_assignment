class Gun
{
	String model;
	String manufacturer;
	double caliber;
	int magazineCapacity;
	boolean isAutomatic;
	int weight;
	public Gun()
	{
		super();
		System.out.println("GUN");
	}
	public Gun(String model)
	{
		this();
		this.model=model;
	}
	public Gun(String model,String manufacturer)
	{
		this(model);
		this.manufacturer=manufacturer;
	}
	public Gun(String model,String manufacturer,double caliber)
	{
		this(model,manufacturer);
		this.caliber=caliber;
	}
	public Gun(String model,String manufacturer,double caliber,int magazineCapacity)
	{
		this(model,manufacturer,caliber);
		this.magazineCapacity=magazineCapacity;
	}
	public Gun(String model,String manufacturer,double caliber,int magazineCapacity,boolean isAutomatic)
	{
		this(model,manufacturer,caliber,magazineCapacity);
		this.isAutomatic=isAutomatic;
	}
	public Gun(String model,String manufacturer,double caliber,int magazineCapacity,boolean isAutomatic,int weight)
	{
		this(model,manufacturer,caliber,magazineCapacity,isAutomatic);
		this.weight=weight;
	}
	
	public void display()
	{
		System.out.println("GUN\nModel: " + model);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Caliber: " + caliber + " mm");
        System.out.println("Magazine Capacity: " + magazineCapacity);
        System.out.println("Automatic: " + isAutomatic);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("------------------------");
	}
}