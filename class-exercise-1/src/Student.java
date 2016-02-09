//********************************************************************
//  Student.java       Author: Lewis/Loftus
//
//  Represents a college student.
//********************************************************************

public class Student
{
	private String firstName, lastName;
	private Address homeAddress, schoolAddress;
	Phone phoneNum;

	//-----------------------------------------------------------------
	//  Constructor: Sets up this student with the specified values.
	//-----------------------------------------------------------------
	public Student(String first, String last, Address home, Address school, Phone num)
	{
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		phoneNum = num;
	}
   
   	//-----------------------------------------------------------------
   	//  Returns a string description of this Student object.
   	//-----------------------------------------------------------------
   	public String toString()
   	{
   		String result;

   		result = firstName + " " + lastName + "\n\n";
   		result += "Home Address:\n" + homeAddress + "\n\n";
   		result += "School Address:\n" + schoolAddress + "\n\n";
   		result += "Phone: " + phoneNum.getPhoneNum() + "\n\n_________________";

   		return result;
   	}
}
