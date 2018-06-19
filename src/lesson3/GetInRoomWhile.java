package lesson3;

import java.util.Scanner;

class GetInRoomWhile {

    public static void main(String[] args) {
        int secretKey = 12345;
        while (true) {
            int userInput = getSecretKeyFromUser();
            if (isValidKey(userInput, secretKey)) {
                break;
            }
        }
        System.out.println("Hello");
    }

    public static int getSecretKeyFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter secret key: ");
        int userInput = scanner.nextInt();
        return userInput;
        // return scanner.nextInt();
    }

    public static boolean isValidKey(int userInput, int validKey) {
        return userInput == validKey;
    }
}
