// area of rectangle
import java.util.Scanner;

public class Areaofrectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.priAreaofrectangle nt("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        Areaofrectangle ar=new Areaofrectangle();
         ar.calculateRectangleArea(length, width);

        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
    void calculateRectangleArea(double length, double width) {
        double a=length* width;
        System.out.print("area is "+a);
        
    }
}
