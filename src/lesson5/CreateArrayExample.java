package lesson5;

import java.util.Random;

class CreateArrayExample {

    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(101);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
