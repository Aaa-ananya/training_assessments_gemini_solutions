// SimpleCompoundInterest.java
import java.util.Scanner;

public class SimpleCompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double t = sc.nextDouble();

        // Simple Interest
        double si = (p * r * t) / 100;

        // Compound Interest
        double ci = p * Math.pow((1 + r / 100), t) - p;

        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
}
// This code calculates both Simple Interest and Compound Interest based on user input for Principal, Rate of Interest, and Time.