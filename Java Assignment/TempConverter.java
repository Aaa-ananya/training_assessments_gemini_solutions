// TempConverter.java
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
// Formula to convert Celsius to Fahrenheit
        // F = (C * 9/5) + 32
        double f = (c * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + f);
    }
}
