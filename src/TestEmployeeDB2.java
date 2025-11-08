import java.util.Scanner;
public class TestEmployeeDB2 {

	public static void main(String[] args) {
				
		EmployeeCreation ec= new EmployeeCreation();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome Employee DB Creation");
		System.out.println("------------------------------");
		System.out.println("Enter the size of DB to be created");
		int size = sc.nextInt();
		
		EmployeeDB empDB = new EmployeeDB(size);
		
		System.out.println("DB Capacity: "+empDB.getDbCapacity());
		System.out.println("Total Employee: "+empDB.getEmpCount());
		
		for(int i=0;i<size;i++) {
			
			System.out.println("Enter Employee id");
			int id = sc.nextInt();
			System.out.println( "Enter Employee name");
			String name = sc.next();
			System.out.println("Enter Employee Salary");
			double salary = sc.nextDouble();
			System.out.println("Enter Employee experience");
			double exp = sc.nextDouble();
			System.out.println("Enter Employee rating");
			int rating = sc.nextInt();
			Employee e = ec.createEmployee(id, name, salary, exp, rating);
			empDB.insertEmployee(e);
		}
		System.out.println("Total Employee: "+empDB.getEmpCount());
		empDB.details();
		empDB.searchById(1010);
	}

}
