package Que4;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Customer c1=new Customer();
		
		System.out.print("Enter username");
		c1.setUsername(sc.next());
		
		System.out.print("Enter mobile number");
		c1.setMobileNumber(sc.next());
		
		System.out.print("Enter Email");
		c1.setEmail(sc.next());
		
		System.out.print("Enter password");
		c1.setPassword(sc.next());
		
		if(c1.getUsername().matches("[a-zA-Z]{3,8}")&& c1.getPassword().matches("[A-Za-z0-9]{3,8}") ) {
			
		}
		
	}

}
