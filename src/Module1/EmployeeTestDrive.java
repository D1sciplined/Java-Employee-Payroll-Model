/**
 * 
 */
package Module1;

/**
 * 
 */
public class EmployeeTestDrive {

	
	public static void main(String[] args) {
		//Polymorphism: parent refernce, child objects
		Employee[] employees = new Employee [4];
		
		
		employees[0] = new FullTimeEmployee(101,"Alice",50000,500);
		employees[1] = new PartTimeEmployee(102,"Bob",80,150);
		employees[2] = new FullTimeEmployee(103,"John" , 600 , 150);
		employees[3] = new PartTimeEmployee(104, "Annie", 40, 60);
		
		//Display employee details
		for(Employee emp : employees) {
			emp.displayInfo();
			}
		

	}

	}

