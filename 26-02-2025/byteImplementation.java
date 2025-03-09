class ByteImplementation {
    public static void main(String[] args) {
        byte ASCIIVal = 65;         
        short imagePixelVal = 120;   
        byte sensorReading = 50;   
        short IPAddress = 127;      
        byte diceRoll = 6;         

        
        System.out.println("Initial Status:\nASCII Value: " + ASCIIVal + 
                           ", Image Pixel Value: " + imagePixelVal + 
                           ", Sensor Reading: " + sensorReading + 
                           ", IP Address (Part): " + IPAddress + 
                           ", Dice Roll Outcome: " + diceRoll);

        
        ASCIIVal = 90;         
        imagePixelVal = 200;   
        sensorReading = 75;    
        IPAddress = 192;       
        diceRoll = 3;

        
        System.out.println("Updated Status:\nASCII Value: " + ASCIIVal + 
                           ", Image Pixel Value: " + imagePixelVal + 
                           ", Sensor Reading: " + sensorReading + 
                           ", IP Address (Part): " + IPAddress + 
                           ", Dice Roll Outcome: " + diceRoll);
    }
}
