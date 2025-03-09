class Ladder
{
	public static void climbUp(int noOfSteps)
	{
		System.out.println("I'm Climbing up "+noOfSteps+"Steps");
	}
	public static void climbDown(int noOfSteps)
	{
		System.out.println("I'm Climbing down "+noOfSteps+"Steps");
	}
	public static void status(boolean isOpen)
	{
		System.out.println("Is it Open?"+isOpen);
	}
	public static void setHeight(int height,int noOfSteps)
	{
		System.out.println("Increase height by "+height+" mtrs and "+noOfSteps+"Steps");
	}
	public static void moveLadder(String from,String to)
	{
		System.out.println("Moving ladder from "+from+"to"+to);
	}
	public static void lockLadder(boolean lock,int duration,String mode)
	{
		System.out.println("Is it lock?"+lock+" for "+duration+" in "+mode+"mode");
	}
	public static void foldLadder(boolean fold,int duration,String whereTo)
	{
		System.out.println("Is it folded?"+fold+" for "+duration+" in "+whereTo);
	}
  
    public static void main(String[] args) {
        // Testing the methods
        climbUp(5);
        climbDown(3);
        status(true);
        setHeight(10, 7);
        moveLadder("garage", "backyard");
        lockLadder(true, 30, "secure");
        foldLadder(false, 15, "storage room");
    }
}
