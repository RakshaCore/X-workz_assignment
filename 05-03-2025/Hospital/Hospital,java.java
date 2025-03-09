class Hospital
{
	public static void checkup(String patientname,int age,String mobile,String email,String sickness)
	{
		System.out.println("Checking up " + patientName + " Age: " + age + ", Mobile: " + mobile + ", Email: " + email + ", Sickness: " + sickness +".");
		Doctor.treatment(patientName, age);
	}
}