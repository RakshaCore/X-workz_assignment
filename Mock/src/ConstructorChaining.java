public class ConstructorChaining {
    int age;
    String name;
    String address;

    public ConstructorChaining()
    {
        super();
        System.out.println("No Argument Constructor Called");
    }
    public ConstructorChaining(int age) {
        this();
        this.age = age;
        System.out.println("Age is: " + age);
    }

    public ConstructorChaining(int age, String name) {
        this(age);
        this.name = name;
        System.out.println("Name is "+name);
    }
    public ConstructorChaining(int age, String name, String address) {
        this(age, name);
        this.address = address;
        System.out.println("Address is "+address);
    }

    public static void main(String[] args) {

        ConstructorChaining ConstructorChaining4 = new ConstructorChaining(22,"Raksha","Karwar");

    }

}
