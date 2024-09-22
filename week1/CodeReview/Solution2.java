package week1.CodeReview;

import java.util.Scanner;

public class Solution2 {


	public static boolean isArmstrong(long num) {
		// Write your code here	
		long originalnum = num;
		int sum = 0;
		int digits = String.valueOf(num).length(); // Count the number of digits

		while (num > 0) {
			long digit = num % 10; // Get the last digit
			sum += Math.pow(digit, digits); // Raise to the power of the num of digits
			num /= 10; // Remove the last digit
		}

		return sum == originalnum; // Check if the sum equals the original num
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long num = scanner.nextInt();

		if (isArmstrong(num)) {
			System.out.println(num + " is an Armstrong number.");
		} else {
			System.out.println(num + " is not an Armstrong number.");
		}

		scanner.close();
	}
}
