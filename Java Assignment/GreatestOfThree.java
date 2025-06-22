// GreatestOfThree.java
import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        // Finding the greatest number
        // Initialize max with the first number
        int max = a;
// Compare with the second and third numbers
        if (b > max)
            max = b;
        if (c > max)
            max = c;
// Output the greatest number
        System.out.println("Greatest number is: " + max);
    }
}
 