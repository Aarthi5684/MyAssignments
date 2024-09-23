package week1.homeAssignment;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[]= {1, 4,3,2,8, 6, 7};
		int len = input.length;
		Arrays.sort(input);
		for (int i=0;i<len;i++) {
			int temp = i+1;

			if (input[i]!=temp) {
				System.out.println("Missing element is :"+temp);
				break;
			}
		}

	}

}
