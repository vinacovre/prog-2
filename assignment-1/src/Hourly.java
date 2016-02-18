public class Hourly extends Employee {
	private int hoursWorked;

	// Constructor: Set up employee with the specified information.
	public Hourly(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		hoursWorked = 0;
	}

	public void addHours(int moreHours) // Adds the specified number of hours
	{
		hoursWorked += moreHours;
	}

	public double pay() // Computes and returns the pay
	{
		double payment = payRate * hoursWorked;
		hoursWorked = 0;
		return payment;
	}

	public String toString() {
		String result = super.toString();
		result += "\nCurrent hours: " + hoursWorked;
		return result;
	}
}