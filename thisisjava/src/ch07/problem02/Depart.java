package ch07.problem02;

public class Depart extends Employee {

	private String department;
	
	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	public String getDepart() {
		return department;
	}

	public void setDepart(String depart) {
		this.department = depart;
	}
	
	@Override
	public void getInformation() {
		System.out.println("이름:" + super.getName() + " 연봉:" + super.getSalary() + " 부서:"+ department);
		// this.getName()도 가능!
	}
	

}