package Que2;

public class TemperoryEmployee extends Employee{
	private int hourworked;
	private int hourlyWages;
	
	
	public TemperoryEmployee(int employeeId, String employeeName, int hourworked, int hourlyWages) {
		super(employeeId, employeeName);
		this.hourworked = hourworked;
		this.hourlyWages = hourlyWages;
		calculateSalary();
	}


	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		this.salary=hourworked*hourlyWages;
	}
	
}
