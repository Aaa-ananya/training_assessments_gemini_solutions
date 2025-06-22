// EqualityCheck.java
import java.util.Scanner;

public class EqualityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//taking input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
//checking equality
        if (a == b)
            System.out.println("Numbers are equal.");
        else
            System.out.println("Numbers are not equal.");
    }
}
