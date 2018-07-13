package lesson6;

import java.util.Random;
import java.util.stream.IntStream;

public class SumOfAllNumbersInArray {

    public static void main(String[] args) {
        int[] array = createArray(10);
        fillArrayWithRandomNumbers(array);
        printArrayToConsole(array);
        sumArrayElementsFirstMethod(array);
        sumArrayElementsSecondMethod(array);
    }

    public static void sumArrayElementsFirstMethod(int[] arr) {
        int sum = calculateElementsSumInArray(arr);
        printMessageToConsole("Sum of all numbers in array: " + sum);
    }

    public static void sumArrayElementsSecondMethod(int[] arr) {
        int sum1 = IntStream.of(arr).sum();
        printMessageToConsole("Sum of all numbers in array: " + sum1);
    }

    public static void printMessageToConsole(String message) {
        System.out.println(message);
    }

    public static int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public static void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
    }

    public static void printArrayToConsole(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static int calculateElementsSumInArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

}
