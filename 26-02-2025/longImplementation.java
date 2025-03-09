class LongImplementation {
    public static void main(String[] args) {
        long bankAccNo = 123456789012L;  
        long aadharNo = 987654321012L;   
        long creditCardNo = 5555444433332222L;  
        long lightSpeed = 299792458L;   
        long noOfStars = 100000000000L; 
        System.out.println("Initial Status:\nBank Account No: " + bankAccNo + 
                           ", Aadhar No: " + aadharNo + 
                           ", Credit Card No: " + creditCardNo + 
                           ", Speed of Light: " + lightSpeed + " m/s" +
                           ", Number of Stars: " + noOfStars);

        bankAccNo = 987654321098L;  
        aadharNo = 123456789876L;    
        creditCardNo = 1111222233334444L;  
        lightSpeed = 300000000L;     
        noOfStars = 200000000000L;  
        System.out.println("Updated Status:\nBank Account No: " + bankAccNo + 
                           ", Aadhar No: " + aadharNo + 
                           ", Credit Card No: " + creditCardNo + 
                           ", Speed of Light: " + lightSpeed + " m/s" +
                           ", Number of Stars: " + noOfStars);
    }
}
