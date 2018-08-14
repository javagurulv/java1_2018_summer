package lesson11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserExceptionHandling {

    public static void main(String[] args) {
        System.out.println("Number = " + getNumberFromUser());
    }

    private static int getNumberFromUser() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter a number:");
                String str = sc.nextLine();
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Not a number, please try again!");
            }
        }
    }

}
