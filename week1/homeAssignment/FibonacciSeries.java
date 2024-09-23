package week1.homeAssignment;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a limit for fibonacci series : ");
		int number = scanner.nextInt();

		int a=0;
		int b=1;
		int f=0;

		System.out.println("Fibinacci series : ");
		for (int i=1;i<=number;i++) {
			f=a+b;
			a=b;
			b=f;
			System.out.print(f+",");
		}



	}

}
