// MarksCalculator.java
import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int sum = 0;

        // Taking input of marks
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
// Calculating total marks and percentage
        double percentage = sum / 5.0;
        // Displaying the results
        System.out.println("Total Marks: " + sum);
        System.out.println("Percentage: " + percentage + "%");
    }
}
