package lesson2;

import java.util.Scanner;

public class AddTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get first number from user
        System.out.println("Enter first number:");
        int firstNumber = sc.nextInt();

        // Get second number from user
        System.out.println("Enter second number:");
        int secondNumber = sc.nextInt();

        // Add two numbers
        int sum = firstNumber + secondNumber;

        // Print result to console
        System.out.println("Sum = " + sum);




    }

}
