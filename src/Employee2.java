
public class Employee2 implements Runnable {

	private int eno;
	private String ename;
	private int salary;
	private String designation;
	private String department;

	public void Employee(int eno, String ename, int salary, String designation, String department) {
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
		this.designation = designation;
		this.department = department;
	}

	public void run() {

		System.out.println("Hra for emp " + ename + " :" + (0.1 * salary));
		System.out.println("DA for emp " + ename + " :" + (0.25 * salary));
		System.out.println("CA for emp " + ename + " :" + (0.1 * salary));

	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
