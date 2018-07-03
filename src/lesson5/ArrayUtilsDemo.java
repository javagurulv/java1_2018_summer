package lesson5;

class ArrayUtilsDemo {

    public static void main(String[] args) {
        int[] array = ArrayUtils.createArray(5);
        ArrayUtils.printArrayToConsole(array);
        System.out.println();
        ArrayUtils.fillArrayWithRandomNumbers(array);
        ArrayUtils.printArrayToConsole(array);
    }
}
