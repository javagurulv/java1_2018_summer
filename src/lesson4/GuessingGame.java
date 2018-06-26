package lesson4;

import java.util.Random;
import java.util.Scanner;

class GuessingGame {

    public static void main(String[] args) {
        int guessedNumber = getRandomNumber(1, 101);
        boolean isGuessed = false;
        while (!isGuessed) {
            int userInput = getNumberFromUser();
            isGuessed = isEquals(userInput, guessedNumber);
            if (isGuessed) {
                printResultToConsole("OK");
            } else if (userInput < guessedNumber) {
                printResultToConsole("Smaller than guessed number");
            } else {
                printResultToConsole("Bigger than guessed number");
            }
        }

    }

    public static boolean isEquals(int firstNumber, int secondNumber) {
        return firstNumber == secondNumber;
    }

    public static int getRandomNumber(int from, int to) {
        Random randomNumberGenerator = new Random();
        return randomNumberGenerator.nextInt(to - from) + from;
    }

    public static int getNumberFromUser() {
        System.out.println("Please enter number: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void printResultToConsole(String result) {
        System.out.println("Result: " + result);
    }

}
