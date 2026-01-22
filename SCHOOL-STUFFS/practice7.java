//Write a program in Java that inputs the value of two integers. Calculate and display the value of their power of second integer.
import java.util.Scanner;

public class practice7
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        
        double result = Math.pow(base, exponent);
        
        System.out.println(base + " raised to the power of " + exponent + " = " + result);
        
        scanner.close();
    }
 }