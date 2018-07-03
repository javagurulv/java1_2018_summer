package lesson5;

import java.util.Random;

class CreateTwoDimensionArrayExample {

    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int[][] array = new int[10][15];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomGenerator.nextInt(101);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
