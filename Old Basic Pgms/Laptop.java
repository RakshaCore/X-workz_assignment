class Laptop
{
	void turnOn(){System.out.println("Laptop is turning on");}
	void turnOff() { System.out.println("Laptop is shutting down"); }
	void chargeBattery() { System.out.println("Charging battery"); }
    void increaseBrightness() { System.out.println("Increasing brightness"); }
    void decreaseBrightness() { System.out.println("Decreasing brightness"); }
	public static void main(String[] args)
	{
	ProgramRunner.compileCode();
	ProgramRunner.runProgram();
    ProgramRunner.debugCode();
    ProgramRunner.testSoftware();
    ProgramRunner.deploySoftware();
    }		
	}
}