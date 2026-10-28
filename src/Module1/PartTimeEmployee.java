/**
 * 
 */
package Module1;


public class PartTimeEmployee extends Employee {

	
	int hoursWorked;
	double hourlyRate;
	
	//constructor
	public PartTimeEmployee(int id,String name, int hoursWorked, double hourlyRate) {
		super(id, name, 0); //baseSalary not used for part- time
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
		
	}
	
	@Override 
	public double calculateSalary () {
		 return hoursWorked * hourlyRate ;
	
	}

}
