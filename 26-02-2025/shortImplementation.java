class ShortImplementation {
    public static void main(String[] args) {
        short weatherTemp = 25;   
        short gpsValue = 120;     
        short speed = 60;         
        short degree = 90;        
        short fuelLevel = 50;     
        System.out.println("Initial Status:\nWeather Temp: " + weatherTemp + 
                           "C, GPS Value: " + gpsValue + 
                           ", Speed: " + speed + " km/h, Degree: " + degree + 
                           ", Fuel Level: " + fuelLevel + "%");

   
        weatherTemp = 30;  
        gpsValue = 200;    
        speed = 80;        
        degree = 180;      
        fuelLevel = 75;    
        System.out.println("Updated Status:\nWeather Temp: " + weatherTemp + 
                           "C, GPS Value: " + gpsValue + 
                           ", Speed: " + speed + " km/h, Degree: " + degree + 
                           ", Fuel Level: " + fuelLevel + "%");
    }
}
