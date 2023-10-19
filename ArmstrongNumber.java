import java.util.Scanner;

public class ArmstrongNumber {
    // Function to calculate the power of a number
    static int power(int num, int p) {
        int result = 1;
        for (int i = 0; i < p; i++) {
            result *= num;
        }
        return result;
    }

    // Function to check if a number is an Armstrong number
    static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += power(digit, numDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
