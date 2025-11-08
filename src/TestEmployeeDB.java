import java.util.Scanner;
public class TestEmployeeDB {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		
		EmployeeCreation ec= new EmployeeCreation(); 
		
		EmployeeDB empDB= new EmployeeDB(5);
		System.out.println("DB Capacity :"+empDB.getDbCapacity());
		System.out.println("Total Employee :"+empDB.getEmpCount());
		
		Employee e1 = ec.createEmployee(1010,"Bheem",25000.00,1.0,3);
		Employee e2 = ec.createEmployee(3554,"Chutki",55000.00,1.5,2);
		Employee e3 = ec.createEmployee(3434,"Raju",45000.00,2.0,4);
		Employee e4 = ec.createEmployee(5577,"Kalia",15000.00,0.5,2);
		Employee e5 = ec.createEmployee(2355,"Indu",35000.00,3,1);
		
		empDB.insertEmployee(e1);
		empDB.insertEmployee(e2);
		empDB.insertEmployee(e3);
		empDB.insertEmployee(e4);
		empDB.insertEmployee(e5);
		
		System.out.println("Total Employee = "+empDB.getEmpCount());
		empDB.details();
		empDB.searchById(1010);
		empDB.searchByName("raju");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter index to delete: ");
		int index = sc.nextInt();

		empDB.removeEmployee(index);
		empDB.details();
		System.out.println("Main Method Ended");
		
		
					
	}

}
