package lesson6;

public class SumOfAllNumbersInArrayTest {

    public static void main(String[] args) {
        createArrayTest();
        calculateElementsSumInArrayTest();
    }

    public static void createArrayTest() {
        int[] arr = SumOfAllNumbersInArray.createArray(10);
        checkTestResult(arr.length == 10, "createArrayTest");
    }

    public static void calculateElementsSumInArrayTest() {
        int[] arr = {0, 1, 2};
        int sum = SumOfAllNumbersInArray.calculateElementsSumInArray(arr);
        checkTestResult(sum == 3, "calculateElementsSumInArrayTest");
    }

    public static void checkTestResult(boolean isCorrect, String testName) {
        if (isCorrect) {
            System.out.println("Test " + testName + " = OK");
        } else {
            System.out.println("Test " + testName + " = FAIL");
        }
    }

}
