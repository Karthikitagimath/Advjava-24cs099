package program3;

import java.util.Random;
import java.util.Scanner;

public class StringExercises {

    // Q6: Capitalize first letter of each word
    public static String capitalizeWords(String str) {
        String[] words = str.toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1))
                      .append(" ");
            }
        }
        return result.toString().trim();
    }

    // Q7: Truncate string and add ellipsis (...)
    public static String truncate(String str, int length) {
        if (str.length() <= length) {
            return str;
        }
        return str.substring(0, length) + "...";
    }

    // Q8: Check if string is numeric
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    // Q9: Generate random string of given length
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }

    // Q10: Count number of words
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q6
        System.out.println("Enter a sentence:");
        String input1 = sc.nextLine();
        System.out.println("Capitalized: " + capitalizeWords(input1));

        // Q7
        System.out.println("\nEnter string to truncate:");
        String input2 = sc.nextLine();
        System.out.println("Enter max length:");
        int len = sc.nextInt();
        sc.nextLine(); // clear buffer
        System.out.println("Truncated: " + truncate(input2, len));

        // Q8
        System.out.println("\nEnter string to check numeric:");
        String input3 = sc.nextLine();
        System.out.println("Is Numeric: " + isNumeric(input3));

        // Q9
        System.out.println("\nEnter length for random string:");
        int randLen = sc.nextInt();
        System.out.println("Random String: " + generateRandomString(randLen));
        sc.nextLine(); // clear buffer

        // Q10
        System.out.println("\nEnter sentence to count words:");
        String input5 = sc.nextLine();
        System.out.println("Word Count: " + countWords(input5));

        sc.close();
    }
}
