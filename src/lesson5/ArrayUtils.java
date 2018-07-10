package lesson5;

import java.util.Random;
import java.util.Scanner;

class ArrayUtils {

    public static int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public static void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

    public static int getNumberFromUser() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void printArrayToConsole(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static void printArrayToConsole(int[][] array) {
        String str = convertArrayToString(array);
        printStringToConsole(str);
    }

    public static void printStringToConsole(String str) {
        System.out.println(str);
    }

    public static String convertArrayToString(int[][] array) {
        String str = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                str = str + array[i][j];
                if (j < array[i].length - 1) {
                    str = str + ",";
                }
            }
            str = str + "\n";
        }
        return str;
    }


    public static int[][] createTwoDimensionArray(int row, int column) {
        return new int[row][column];
    }

    public static void fillArrayWithMultiplyNumbersResults(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
    }


}
