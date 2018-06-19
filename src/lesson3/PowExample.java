package lesson3;

import java.util.Scanner;

class PowExample {

    public static void main(String[] args) {
        int number = getNumberFromUser();
        int power = getNumberFromUser();
        int powerResult = pow(number, power);
        System.out.println("Result: " + powerResult);
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        return scanner.nextInt();
    }

    public static int pow(int number, int power) {
        if (number == 0) {
            return 0;
        }
        if (power == 0) {
            return 1;
        }
        int result = number;
        for (int i = 1; i < power; i++) {
            result = number * result;
        }
        return result;
    }
}
