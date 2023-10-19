import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower limit of the range: ");
        int lowerLimit = scanner.nextInt();

        System.out.print("Enter the upper limit of the range: ");
        int upperLimit = scanner.nextInt();

        System.out.println("Prime numbers between " + lowerLimit + " and " + upperLimit + ":");
        printPrimeNumbersInRange(lowerLimit, upperLimit);

        scanner.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Function to print prime numbers in a given range
    public static void printPrimeNumbersInRange(int lowerLimit, int upperLimit) {
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
