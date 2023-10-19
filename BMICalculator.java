import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        String result = (bmi < 18.5) ? "Underweight" : (bmi < 24.9) ? "Normal weight" : (bmi < 29.9) ? "Overweight" : "Obese";

        System.out.println("Your BMI is " + bmi);
        System.out.println("You are classified as: " + result);

        scanner.close();
    }
}
