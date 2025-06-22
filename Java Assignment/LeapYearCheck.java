// LeapYearCheck.java
import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();
// Check if the year is a leap year
        // A year is a leap year if it is divisible by 4,   
        // but not divisible by 100, unless it is also divisible by 400
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(isLeap ? "Leap year" : "Not a leap year");
    }
}
