class MNCCompany {
    void hireEmployee() { System.out.println("Hiring an employee"); }
    void conductMeeting() { System.out.println("Conducting a meeting"); }
    void launchProduct() { System.out.println("Launching a new product"); }
    void analyzeMarket() { System.out.println("Analyzing market trends"); }
    void expandBusiness() { System.out.println("Expanding business globally"); }
    
    void invokeMethods(Employee employee) {
        employee.work();
        employee.attendMeeting();
        employee.submitReport();
        employee.getPromotion();
        employee.quitJob();
    }
}