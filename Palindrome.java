import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        // Convert the number to a string for character comparison
        String numStr = String.valueOf(number);
        int length = numStr.length();

        // Compare characters from the beginning and the end
        for (int i = 0; i < length / 2; i++) {
            if (numStr.charAt(i)
