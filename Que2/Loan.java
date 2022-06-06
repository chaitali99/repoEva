package Que2;

public class Loan {
	public double calculateLoanAmount(Employee employeeObj) {
		double loan=0;
		
		//PermanentEmployee e1=new PermanentEmployee();
		if(employeeObj instanceof PermanentEmployee){
			//PermanentEmployee emp = null;
			loan=employeeObj.salary*15/100;
			return loan;
		}
		if(employeeObj instanceof TemperoryEmployee){
			//TemperoryEmployee emp=null;
			loan=employeeObj.salary*10/100;
			return loan;
		}
		return 0;
	}
	
	
}
