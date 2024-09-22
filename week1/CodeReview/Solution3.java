package week1.CodeReview;

public class Solution3 {
	 public static String reverseString(String input) {
	        if (input == null) {
	            return "Invalid Input";
	        }

	        StringBuilder reversed = new StringBuilder(input);
	        return reversed.reverse().toString();
	    }

	    public static void main(String[] args) {
	        // Example 1
	        String input1 = "testleaf";
	        System.out.println("Input: \"" + input1 + "\"");
	        System.out.println("Output: \"" + reverseString(input1) + "\"");

	        // Example 2
	        String input2 = null;
	        System.out.println("Input: \"" + input2 + "\"");
	        System.out.println("Output: \"" + reverseString(input2) + "\"");
	    }

}
