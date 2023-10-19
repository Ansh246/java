import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        
        // Read the radius from the user
        double radius = scanner.nextDouble();
        
        // Calculate the area of the circle
        double area = Math.PI * Math.pow(radius, 2);
        
        // Display the result
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
        
        // Close the scanner
        scanner.close();
    }
}
