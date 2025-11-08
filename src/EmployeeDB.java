
public class EmployeeDB {
	
	public  int dbCapacity;
	public Employee[] empArr;
	public int index=0;
	public int empCount;
	/**
	 * 
	 * @param dbCapacity
	 */
	public EmployeeDB(int dbCapacity) {
		
		this.dbCapacity = dbCapacity;
		this.empArr = new Employee[dbCapacity];
	}
	/**
	 * 
	 * @return
	 */
	public int getDbCapacity() {
		
		return dbCapacity;
	}
	/**
	 * 
	 * @param emp
	 * @return
	 */
	public boolean insertEmployee(Employee emp) {
		
		if(index<dbCapacity) {
			empArr[index++] = emp;
			empCount++;
			System.out.println("Employee record stored in DB");
			return true;
		}
		else {
			System.out.println("DB is full");
			return false;
		}
	}
	/**
	 * 
	 * @return
	 */
	public int getEmpCount() {
		return empCount;
	}
	/**
	 * 
	 */
	public void details() {
		System.out.println("---------------------------------------");
		System.out.println("ID\tName\tSalary\tExp\tRating");
		System.out.println("---------------------------------------");
		
		for(int i=0;i<dbCapacity;i++) {
			System.out.println(empArr[i].id+"\t"+empArr[i].name+"\t"+
							   empArr[i].salary+"\t"+
							   empArr[i].exp+"\t"+empArr[i].rating);   
			}
		}
	/**
	 * this method is use to Search Employee by ID
	 * @param id
	 */
	public void searchById(int id) {
		System.out.println("-----------------------------------");
		System.out.println("--------Search By ID--------------");
		System.out.println("-----------------------------------");
		
		boolean flag=false;
		for(int i=0;i<empCount;i++) {
			if(empArr[i]!=null && empArr[i].id==id) {
				System.out.println(empArr[i].id+"\t"+empArr[i].name+"\t"+
						   empArr[i].salary+"\t"+
						   empArr[i].exp+"\t"+empArr[i].rating);
			
			flag=true;
			}
			
		}
		if(flag==false) {
			System.out.println("Data Not Found");
		}
}
	/**
	 * this method is use to Search Employee by Experience
	 * @param exp
	 */
	public void searchByExp(double exp) {
		System.out.println("-----------------------------------");
		System.out.println("--------Search By Exp--------------");
		System.out.println("-----------------------------------");
		
		boolean flag=false;
		for(int i=0;i<empCount;i++) {
			if(empArr[i]!=null && empArr[i].exp==exp) {
				System.out.println(empArr[i].id+"\t"+empArr[i].name+"\t"+
						   empArr[i].salary+"\t"+
						   empArr[i].exp+"\t"+empArr[i].rating);
			
			flag=true;
			}
			 
		}
		if(flag==false) {
			System.out.println("Data Not Found");
		}
		
	}
	
	/**
	 * this method is use to Search  Employee by the name
	 * @param name
	 */
	public void searchByName(String name) {
		System.out.println("-----------------------------------");
		System.out.println("--------Search By Name------------");
		System.out.println("----------------------------------");
		boolean flag=false;
		for(int i=0;i<empCount;i++) {
			if(empArr[i]!=null && empArr[i].name.equalsIgnoreCase(name)) {
				System.out.println(empArr[i].id+"\t"+empArr[i].name+"\t"+
						   empArr[i].salary+"\t"+
						   empArr[i].exp+"\t"+empArr[i].rating);
			
			flag=true;
			}
			
		}
		if(flag==false) {
			System.out.println("Data Not Found");
		}
	}
	/**
	 * this method is use to remove Employee from the DataBase
	 * @param index
	 */
public void removeEmployee(int index) {
	if(index<0||index>empArr.length-1) {
		System.out.println("Invalid index");
	}
	else {
		for(int i=index;i<empArr.length-1;i++) {
			empArr[i]=empArr[i+1];
			
		}
		System.out.println("Employee deleted");
//		empArr[index]=null;
		index--;	
	}
}
	

}

