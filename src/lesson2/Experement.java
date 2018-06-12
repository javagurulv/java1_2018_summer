package lesson2;

import java.util.Scanner;

public class Experement {

    public static int getNumberFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        return sc.nextInt();
    }

    public static int findMaxNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public static void printMaxNumberToConsole(int maxNumber) {
        System.out.println("Greatest number = " + maxNumber);
    }

    public static void main(String[] args) {
        int firstNumber = getNumberFromUser();
        int secondNumber = getNumberFromUser();
        int maxNumber = findMaxNumber(firstNumber, secondNumber);
        printMaxNumberToConsole(maxNumber);
    }

}
