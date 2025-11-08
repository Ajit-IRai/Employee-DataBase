
public class EmployeeCreation {
/**
 * this method create Employee object and return to the caller method 
 * @param id
 * @param name
 * @param salary
 * @param exp
 * @param rating
 * @return
 */
	
	public Employee createEmployee(int id, String name, double salary, double exp, int rating) {
		Employee e= new Employee(id,name,salary,exp,rating);
		return e;// return reference of Employee
	}
}
