public class StudentBody 
{
	//-----------------------------------------------------------------
	//  Creates some Address and Student objects and prints them.
	//-----------------------------------------------------------------
	public static void main(String[] args)
	{
		// SCHOOL FOR JOHN AND MARSHA
		Address school = new Address("800 Lancaster Ave.", "Villanova", "PA", 19085);
      
		// JOHN
		Address jHome = new Address("21 Jump Street", "Lynchburg", "VA", 24551);
		Phone jPhone = new Phone("123-456");
		Student john = new Student("John", "Smith", jHome, school, jPhone);

		//MARSHA
		Address mHome = new Address("123 Main Street", "Euclid", "OH", 44132);
		Phone mPhone = new Phone("000-000");
		Student marsha = new Student("Marsha", "Jones", mHome, school, mPhone);
		
		System.out.println(john);
		System.out.println();
		System.out.println(marsha);
	}
}