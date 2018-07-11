package lesson6;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class FindMostFrequentNumberInArray {

    public static void main(String[] args) {
        int[] arr = createArray(10);
        fillArrayWithRandomNumbers(arr);
        int[] frequencyArray = findFrequencyForEachArrayElement(arr);

        int maxFrequency = findMaxElementInArray(frequencyArray);

        Set<Integer> maxNumbersSet = findMaxNumbersSet(
                frequencyArray, arr, maxFrequency
        );

        printSetTOfNumbersToConsole(maxNumbersSet);
    }

    public static void printSetTOfNumbersToConsole(Set<Integer> maxNumbersSet) {
        for (Integer uniqNumber : maxNumbersSet) {
            printMessageToConsole("Number with max frequency = " + uniqNumber);
        }
    }

    public static Set<Integer> findMaxNumbersSet(int[] frequencyArray,
                                                  int[] arr,
                                                  int maxFrequency) {
        Set<Integer> uniqNumbers = new HashSet<>();
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] == maxFrequency) {
                int elementWithMaxFrequency = arr[i];
                uniqNumbers.add(elementWithMaxFrequency);
            }
        }
        return uniqNumbers;
    }

    private static void printMessageToConsole(String message) {
        System.out.println(message);
    }

    private static int findMaxElementInArray(int[] arr) {
        int maxElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
        return maxElement;
    }


    private static int findMaxElementIndexInArray(int[] arr) {
        int maxElementIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxElementIndex]) {
                maxElementIndex = i;
            }
        }
        return maxElementIndex;
    }

    private static int[] findFrequencyForEachArrayElement(int[] arr) {
        int[] frequencyArray = createArray(arr.length);
        for (int i = 0; i < arr.length; i++) {
            frequencyArray[i] = findElementFrequencyInArray(i, arr);
        }
        return frequencyArray;
    }

    private static int findElementFrequencyInArray(int elementIndex,
                                                   int[] arr) {
        int frequency = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[elementIndex] == arr[i]) {
                frequency++;
            }
        }
        return frequency;
    }

    private static int[] createArray(int length) {
        return new int[length];
    }

    private static void fillArrayWithRandomNumbers(int[] arr) {
        Random randomGenerator = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomGenerator.nextInt(100);
        }
    }

}
