
public abstract class Employee {
	
	private static int starting;
	
	static {	//static initializer block;
		System.out.println("Employee class loaded...");
		starting = 100;
	}
	private int empNo;
	private String empName;
	private double salary;
	
	
	public Employee(String empName, double salary) {
		this.empNo = ++starting;
		this.empName = empName;
		this.salary = salary;
	}
	
	public void payslip() {
		System.out.println("\nEmp No: " + empNo);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
	}

	public double getSalary() {
		return salary;
	}
	
	public String getEmpName() {
		return this.empName;
	}


}
