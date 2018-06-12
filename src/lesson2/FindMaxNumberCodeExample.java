package lesson2;

import java.util.Scanner;

public class FindMaxNumberCodeExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Receive first number from user
        System.out.println("Enter first number:");
        int firstNumber = sc.nextInt();

        // Receive second number from user
        System.out.println("Enter second number:");
        int secondNumber = sc.nextInt();

        // Compare numbers and print max number to console
        if (firstNumber > secondNumber) {
            System.out.println("Max number is = " + firstNumber);
        } else {
            System.out.println("Max number is = " + secondNumber);
        }
    }

}
