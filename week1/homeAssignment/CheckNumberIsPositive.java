package week1.homeAssignment;

import java.util.Scanner;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to check if prime: ");
	        int number = scanner.nextInt();
	    
	        if(number > 0) {
	        	System.out.println("Entered number is positive");
	        }
	        else 
	        {
	        	System.out.println("Entered number is negative");
	        }

	}

}
