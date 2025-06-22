// SwapValues.java
import java.util.Scanner;

public class SwapValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, temp;

        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();

        // Using third variable
        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
