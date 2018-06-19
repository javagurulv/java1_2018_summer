package lesson3;

import java.util.Scanner;

class GetInRoomDoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretKey = 12345;
        int userInput;
        do {
            System.out.println("Please enter secret key: ");
            userInput = scanner.nextInt();
        } while (userInput != secretKey);

        System.out.println("Hello");
    }
}
