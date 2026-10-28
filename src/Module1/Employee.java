/**
 *  Create a program that models different types of employees using inheritance and polymorhispm.
 * 
 * 1.Parent Class: Employee - abstract class (cannot be instantiated)
 * 	Fields: String name 
 * 			int id
 * 			double baseSalary
 *	Constructor to initialize all fields
 *	Methods:
 *		doubble calculateSalary() - returns baseSalary
 * 	Constructor to initialize all fields
 * Method: 
 * 	double calculateSalary() - returns baseSalary
 * 	void displayInfo() - prints employee details
 * 
 * 2.	Subclass: FullTimeEmployee
 * 
 * Additional Field:
 * 		double bonus 
 * Override:
 * 		calculateSalary() - baseSalary + bonus
 * 
 * 3. Subclass: PartTimeEmmployee
 * Additional field:
 * 	int hoursWorked
 * 	double hourlyRate
 * 
 * Override:
 * 		calculateSalary() - hoursWorked * hourlyRate
 */

package Module1;


public abstract class Employee {
		
		//Attributes
		 String name;
		 int id;
		 double baseSalary;
		 
		 //Constructor
		 public Employee (int id,String name, double baseSalary) {
			 this.id = id;
			 this.name = name;
			 this.baseSalary = baseSalary;
			 
		 }
		 //Abstract method (polymorphism)
		public abstract double calculateSalary();
		 
		 //Common method
		 public void displayInfo() {
			 System.out.println(
					 "ID:" +id +
					 ",Name:" + name +
					 ", Salary: " + calculateSalary());
		 
		 
		
	}

}
