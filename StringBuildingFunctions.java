//3a. Develop a java program for performing various string operations with different string handling functions directed as follows:
//String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and endsWith()

package program3;

	import java.util.Scanner;
	public class StringBuildingFunctions {


	    // Q1: Check if string is null or empty (only whitespace)
	    public static boolean isNullOrEmpty(String str) {
	        return (str == null || str.trim().isEmpty());
	    }

	    // Q2: Count occurrences of substring
	    public static int countOccurrences(String mainStr, String subStr) {
	        int count = 0, index = 0;

	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length();
	        }

	        return count;
	    }

	    // Q3: Reverse a string
	    public static String reverseString(String str) {
	        return new StringBuilder(str).reverse().toString();
	    }

	    // Q4: Check palindrome (ignore case & punctuation)
	    public static boolean isPalindrome(String str) {
	        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        String reversed = new StringBuilder(cleaned).reverse().toString();
	        return cleaned.equals(reversed);
	    }

	    // Q5: Remove all whitespace
	    public static String removeWhitespace(String str) {
	        return str.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Q1
	        System.out.println("Enter a string to check null or empty:");
	        String input1 = sc.nextLine();
	        System.out.println("Is Null or Empty: " + isNullOrEmpty(input1));

	        // Q2
	        System.out.println("\nEnter main string:");
	        String mainStr = sc.nextLine();
	        System.out.println("Enter substring:");
	        String subStr = sc.nextLine();
	        System.out.println("Occurrences: " + countOccurrences(mainStr, subStr));

	        // Q3
	        System.out.println("\nEnter string to reverse:");
	        String input3 = sc.nextLine();
	        System.out.println("Reversed String: " + reverseString(input3));

	        // Q4
	        System.out.println("\nEnter string to check palindrome:");
	        String input4 = sc.nextLine();
	        System.out.println("Is Palindrome: " + isPalindrome(input4));

	        // Q5
	        System.out.println("\nEnter string to remove whitespace:");
	        String input5 = sc.nextLine();
	        System.out.println("Without Whitespace: " + removeWhitespace(input5));

	        sc.close();
	    }
	}

