package lesson4;

import java.util.Scanner;

class FindMaxNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxNumber = Integer.MIN_VALUE;
        int maxNumberIndex = 0;

        int counter = 0;

        while (true) {
            System.out.println("Enter number: ");
            int userInput = in.nextInt();

            if (userInput == 0) {
                break;
            }

            counter++;

            if (userInput > maxNumber) {
                maxNumber = userInput;
                maxNumberIndex = counter;
            }

        }

        System.out.println("Max number: " + maxNumber);
        System.out.println("Max number index: " + maxNumberIndex);
    }
}
