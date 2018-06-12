package lesson2;

import java.util.Scanner;

public class InputOutputExample {

    public static void main(String[] args) {
        // Create Scanner object to read data from console
        Scanner sc = new Scanner(System.in);

        // Get number from user and store it to variable named number
        System.out.println("Enter number:");
        int number = sc.nextInt();

        // Print variable number (its current value) to console
        System.out.println("Entered number is = " + number);
    }

}
