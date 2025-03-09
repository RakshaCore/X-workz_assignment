class CharImplementation 
{
    public static void main(String[] args) 
	{
        char gender = 'M';        
        char seatRow = 'D';       
        char clothingSize = 'L';  
        char bloodGroup = 'O';    
        char trafficLight = 'R';  
        System.out.println("Initialization:\nGender: " + gender + ", Seat Row: " + seatRow +", Clothing Size: " + clothingSize + ", Blood Group: " + bloodGroup +  ", Traffic Light: " + trafficLight);
        
        gender = 'F';       
        seatRow = 'A';       
        clothingSize = 'M';  
        bloodGroup = 'B';    
        trafficLight = 'G';  
        System.out.println("Re-Initialization:\nGender: " + gender +", Seat Row: " + seatRow +", Clothing Size: " + clothingSize +  ", Blood Group: " + bloodGroup + ", Traffic Light: " + trafficLight);
    }
}
