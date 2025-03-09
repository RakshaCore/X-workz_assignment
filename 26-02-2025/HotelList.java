public class LaptopList {
    public static void main(String[] args) {
        String laptopBrand1 = "HP";
        String laptopBrand2 = "Dell";
        String laptopBrand3 = "Lenovo";
        String laptopBrand4 = "Asus";
        String laptopBrand5 = "Acer";
        String laptopBrand6 = "Apple";
        String laptopBrand7 = "Microsoft";
        String laptopBrand8 = "MSI";
        String laptopBrand9 = "Razer";
        String laptopBrand10 = "Samsung";

        String[] laptopBrands = {
            laptopBrand1, laptopBrand2, laptopBrand3, laptopBrand4, laptopBrand5, 
            laptopBrand6, laptopBrand7, laptopBrand8, laptopBrand9, laptopBrand10
        };

        System.out.println("Laptop Brands:");
        for (String laptop : laptopBrands) {
            System.out.println(laptop);
        }
    }
}
