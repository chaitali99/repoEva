package Que2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//Scanner sc=new Scanner(System.in);
		PermanentEmployee e1=new PermanentEmployee(123,"Chaitali",12000);
		TemperoryEmployee e2=new TemperoryEmployee(124,"Ashwini",15,500);
		
		Loan l1=new Loan();
		System.out.println(l1.calculateLoanAmount(e1));
		System.out.println(l1.calculateLoanAmount(e2));
		System.out.println(l1.calculateLoanAmount(null));
	}

}
