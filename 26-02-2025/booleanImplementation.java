class BooleanImplementation {
    public static void main(String[] args) {
        boolean isWeekend = false;   
        boolean isTrafficJam = true; 
        boolean isHoliday = false;   
        boolean isClassCancelled = false; 
        boolean isSirPresent = true; 

   
        System.out.println("Initial Status:\nIs it the weekend? " + isWeekend + 
                           ", Is there a traffic jam? " + isTrafficJam + 
                           ", Is today a holiday? " + isHoliday + 
                           ", Is the class cancelled? " + isClassCancelled + 
                           ", Is the teacher present? " + isSirPresent);

        isWeekend = true;    
        isTrafficJam = false; 
        isHoliday = true;    
        isClassCancelled = true; 
        isSirPresent = false; 
        System.out.println("Updated Status:\nIs it the weekend? " + isWeekend + 
                           ", Is there a traffic jam? " + isTrafficJam + 
                           ", Is today a holiday? " + isHoliday + 
                           ", Is the class cancelled? " + isClassCancelled + 
                           ", Is the Sir pesent? " + isSirPresent);
    }
}
