class FloatImplementation {
    public static void main(String[] args) {
        float windSpeed = 12.5f;      
        float exchangeRate = 83.75f;   
        float bodyTemp = 98.6f;        
        float boilingPoint = 100.0f;   
        float height = 5.9f;          
        System.out.println("Initial Status:\nWind Speed: " + windSpeed + " km/h" + 
                           ", Exchange Rate: " + exchangeRate + " INR/USD" + 
                           ", Body Temperature: " + bodyTemp + "°F" + 
                           ", Boiling Point: " + boilingPoint + "°C" + 
                           ", Height: " + height + " ft");

        
        windSpeed = 25.8f;      
        exchangeRate = 85.20f;   
        bodyTemp = 99.1f;        
        boilingPoint = 101.5f;   
        height = 6.1f;           
        System.out.println("Updated Status:\nWind Speed: " + windSpeed + " km/h" + 
                           ", Exchange Rate: " + exchangeRate + " INR/USD" + 
                           ", Body Temperature: " + bodyTemp + "°F" + 
                           ", Boiling Point: " + boilingPoint + "°C" + 
                           ", Height: " + height + " ft");
    }
}
