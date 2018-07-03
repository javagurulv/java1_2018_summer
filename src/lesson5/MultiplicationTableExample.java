package lesson5;

class MultiplicationTableExample {

    public static void main(String[] args) {
        int[][] array = ArrayUtils.createTwoDimensionArray(10,10);
        ArrayUtils.fillArrayWithMultiplyNumbersResults(array);
        ArrayUtils.printArrayToConsole(array);
    }
}
