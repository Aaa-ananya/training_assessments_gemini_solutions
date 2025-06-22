// GradeCalculator.java
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            sum += sc.nextInt();
        }

        double percentage = sum / 5.0;
        System.out.println("Percentage: " + percentage);
// Determine the grade based on the percentage
        if (percentage >= 90)
                // Print the grade
            System.out.println("Grade: A");
        else if (percentage >= 80)
            System.out.println("Grade: B");
        else if (percentage >= 60)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: D");
    }
}
