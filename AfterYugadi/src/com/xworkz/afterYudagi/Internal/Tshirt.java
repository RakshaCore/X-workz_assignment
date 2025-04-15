package com.xworkz.afterYudagi.Internal;

public class Tshirt {
    private String brand;
    private  String color;
    private int price;

    public Tshirt(String brand,String color,int price)
    {
        this.brand=brand;
        this.color=color;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Tshirt{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public boolean equals(Object obj)
    {
        if (obj!=null)
        {
            if(obj instanceof Tshirt)
            {
                Tshirt tshirt=this;
                Tshirt tshirt1=(Tshirt) obj;
                if(tshirt.brand.equals(tshirt1.brand)&&tshirt.price==tshirt1.price&&tshirt.color.equals(tshirt1.color))
                {
                    System.out.println("Same same");
                    return true;
                }
            }
        }
        return false;
    }
}
