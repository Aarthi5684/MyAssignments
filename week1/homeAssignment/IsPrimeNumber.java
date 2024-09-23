package week1.homeAssignment;

import java.util.Scanner;

public class IsPrimeNumber {
	public static boolean isPrime(int num) {
		if (num <= 1) {
            return false; // Not prime
        }
        
        // Check for 2, which is the only even prime number
        if (num == 2) {
            return true; // Prime
        }
        
        // Check for other even numbers
        if (num % 2 == 0) {
            return false; // Not prime
        }
        
        // Check for factors from 3 to the num
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false; // Found a divisor, so it's not prime
            }
        }
        
        return true; // No divisors found, so it's prime
		
	}
	
	
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to check if prime: ");
	        int number = scanner.nextInt();
	        
	        boolean result = isPrime(number);
	        
	        
	        if (result == true )
	        {
	        		System.out.println("The given number  "+ number + " is  a prime number");
	        }
	        else
	        {
        		System.out.println("The given number  "+ number + " is not a prime number");
        }	
		
	}

}
