package Que3;
import java.util.*;
public class Demo {
	
	void showDetails(Month m) {
		switch(m) {
		case JAN:
			System.out.println("This is the 1st month of the year january ");
			break;
		case FEB:
			System.out.println("This is the 2nd month of the year february");
			break;
		case MAR:
			System.out.println("This is the 3rd month of the year March");
			break;
		case APR:
			System.out.println("This is the 4th month of the year April");
			break;
		case MAY:
			System.out.println("This is the 5th month of the year MAY");
			break;
		case JUN:
			System.out.println("This is the 6th month of the year JUN");
			break;
		case JULY:
			System.out.println("This is the 7th month of the year july");
			break;
		case AUG:
			System.out.println("This is the 8th month of the year August");
			break;
		case SEP:
			System.out.println("This is the 9th month of the year September");
			break;
		case OCT:
			System.out.println("This is the 10th month of the year October");
			break;
		case NOV:
			System.out.println("This is the 11th month of the year November");
			break;
		case DEC:
			System.out.println("This is the 12th month of the year December");
			break;
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Demo d1=new Demo();
		
		try {
			System.out.print("Enter name of month:");
			String mon=sc.next();
			Month month=Month.valueOf(mon);
			d1.showDetails(month);
		}catch(Exception e) {
			System.out.println("Invalid month name");
		}
	}

}
