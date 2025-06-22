// CircleAreaCircumference.java
import java.util.Scanner;

public class CircleAreaCircumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
//formula for area and circumference of a circle
        // Area = π * r^2   
        // Circumference = 2 * π * r
        double area = Math.PI * r * r;
        double circumference = 2 * Math.PI * r;

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
// This code calculates the area and circumference of a circle based on user input for the radius.