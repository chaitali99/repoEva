package Que1;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		try {
			System.out.println("Enter the number of Elements in an array");
			int n=sc.nextInt();
			
			int[] arr=new int[n];
			
			System.out.println("Enter the Elements in the array");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			
			System.out.println("Enter the index of the array element you want to access");
			int ind=sc.nextInt();
			System.out.println(arr[ind]);
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
