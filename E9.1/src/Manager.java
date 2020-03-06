
public class Manager extends Employee {
	
	private String department;
	
	public Manager(String name, int salary, String department) {

		super(name, salary);
		this.department = department;

	}

	public String getdepartment() {
		return department;
	}

	public void setdepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Manager [department=" + department + "]";
	}
	
//	public String toString() {
//		return ("[" + getName() + ", " + department + "]");
//		
//	}
	
	

}
