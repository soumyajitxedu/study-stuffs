import java.util.Scanner;
//
//Write a program in Java that inputs the value of the greater and
//  smaller integer using library functions with suitable messages.
//
//
public class GreaterSmaller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        
        int greater = Math.max(num1, num2);
        int smaller = Math.min(num1, num2);
        
        System.out.println("The greater number is: " + greater);
        System.out.println("The smaller number is: " + smaller);
        
        scanner.close();
    }
}