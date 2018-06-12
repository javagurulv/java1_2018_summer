package lesson2;

import java.util.Scanner;

public class AddTwoNumbers {

    public static void main(String[] args) {
        // Create Scanner object to read data from console
        Scanner sc = new Scanner(System.in);

        // Get first number from user and store it to variable named firstNumber
        System.out.println("Enter first number:");
        int firstNumber = sc.nextInt();

        // Get second number from user  and store it to variable named secondNumber
        System.out.println("Enter second number:");
        int secondNumber = sc.nextInt();

        // Add two numbers and store result to variable named sum
        int sum = firstNumber + secondNumber;

        // Print variable sum (its current value) to console
        System.out.println("Sum = " + sum);
    }

}
