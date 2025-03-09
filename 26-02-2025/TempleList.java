public class TempleList {
    public static void main(String[] args) {
        String temple1 = "Meenakshi Temple";
        String temple2 = "Kashi Vishwanath";
        String temple3 = "Somnath Temple";
        String temple4 = "Kedarnath Temple";
        String temple5 = "Brihadeeswarar Temple";
        String temple6 = "Jagannath Temple";
        String temple7 = "Tirupati Balaji";
        String temple8 = "Rameshwaram Temple";
        String temple9 = "Vaishno Devi Temple";
        String temple10 = "Sun Temple, Konark";

        String[] temples = {
            temple1, temple2, temple3, temple4, temple5, 
            temple6, temple7, temple8, temple9, temple10
        };

        System.out.println("Temple Names:");
        for (String temple : temples) {
            System.out.println(temple);
        }
    }
}
