package lesson6;

import java.util.Scanner;
import java.util.Random;

public class Ugadajka {

    public static void main(String[] args) {
        int userSecretNumber = getSecretNumberFromUser();

        int minNumberRange = 1;
        int maxNumberRange = 101;

        while (true) {
            int computerRandomNumber = getRandomNumberFromInterval(minNumberRange, maxNumberRange);
            printMessageToConsole("Is your number : " + computerRandomNumber + " ???");

            if (isComputerGuesedANumber(userSecretNumber, computerRandomNumber)) {
                printMessageToConsole("OK, my number is :" + userSecretNumber);
                break;
            }
            if (isComputerNumberIsBigger(userSecretNumber, computerRandomNumber)) {
                maxNumberRange = computerRandomNumber;
                printMessageToConsole("My secret number is less than " + maxNumberRange + " !!!");
            }
            if (isComputerNumberIsSmaller(userSecretNumber, computerRandomNumber)) {
                minNumberRange = computerRandomNumber;
                printMessageToConsole("My secret number is more than " + minNumberRange + " !!!");
            }
        }
    }

    private static boolean isComputerNumberIsBigger(int userNumber,
                                                    int computerNumber) {
        return userNumber < computerNumber;
    }

    private static boolean isComputerNumberIsSmaller(int userNumber,
                                                    int computerNumber) {
        return userNumber > computerNumber;
    }

    private static void printMessageToConsole(String message) {
        System.out.println(message);
    }

    public static int getSecretNumberFromUser() {
        System.out.print("Enter your secret number within 0 to 100: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int getRandomNumberFromInterval(int from, int to) {
        Random randomNumberGenerator = new Random();
        return randomNumberGenerator.nextInt(to - from) + from;
    }

    public static boolean isComputerGuesedANumber(int firstNumber, int secondNumber){
        return firstNumber == secondNumber;
    }

}
