// EvenOddCheck.java
import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
//using ternary operator to check even or odd
        // and print the result
        System.out.println(num % 2 == 0 ? "Even" : "Odd");
    }
}
