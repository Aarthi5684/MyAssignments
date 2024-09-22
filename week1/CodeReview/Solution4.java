package week1.CodeReview;

import java.util.Scanner;

public class Solution4 {
	public static int getFactorial(int num) {
		
		// Write your code here		
		// Iterative method to calculate factorial
	    
	        int result = 1;
	        for (int i = 2; i <= num; i++) {
	            result *= i;
	        }
	        return result;
	    
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to calculate its factorial: ");
	        int number = scanner.nextInt();

	        if (number < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	        } else {
	            long result = getFactorial(number);

	            System.out.println("Factorial of " + number + " (Iterative): " + result);
	        }

	        scanner.close();


	}

}
