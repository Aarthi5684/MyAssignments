package week1.CodeReview;

import java.util.Arrays;

public class Solution1 {
	public static boolean isAnagram(String input1, String input2) {
			
			// write your code here
		// Remove whitespace and convert to lowercase
		input1 = input1.replaceAll("\\s+", "").toLowerCase();
		input2 = input2.replaceAll("\\s+", "").toLowerCase();

        // Convert strings to character arrays
        char[] charArray1 = input1.toCharArray();
        char[] charArray2 = input2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String input1 = "Stop";
        String input2 = "Post";

        if (isAnagram(input1, input2)) {
            System.out.println(input1 + " and " + input2 + " are anagrams.");
        } else {
            System.out.println(input1 + " and " + input2 + " are not anagrams.");
        }
			

	}
}