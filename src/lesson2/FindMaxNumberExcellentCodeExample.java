package lesson2;

import java.util.Scanner;

public class FindMaxNumberExcellentCodeExample {

    public static void main(String[] args) {
        int firstNumber = getNumberFromUser();
        int secondNumber = getNumberFromUser();
        int maxNumber = findMaxNumber(firstNumber, secondNumber);
        printMaxNumberToConsole(maxNumber);
    }

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

    public static void findMaxNumberFailedVersion(int firstNumber,
                                                 int secondNumber) {
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);
        }
    }


    public static void printMaxNumberToConsole(int maxNumber) {
        System.out.println("Greatest number = " + maxNumber);
    }

}
