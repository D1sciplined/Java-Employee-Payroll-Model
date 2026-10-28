/**
 * 
 */
package Module1;

/**
 * 
 */
public class FullTimeEmployee extends Employee {

	double bonus;
	
	//constructor
	public FullTimeEmployee(int id,String name, double baseSalary,double bonus) {
		super(id, name, baseSalary);
		this.bonus= bonus;
		
	}
	
	@Override
	public double calculateSalary() {
		return baseSalary + bonus;
	
	}

}

