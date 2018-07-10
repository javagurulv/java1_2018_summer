package lesson5;

public class ArrayUtilsTest {

    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        int[][] arr = {{1, 2, 3}, {1, 2, 3}};
        String result = ArrayUtils.convertArrayToString(arr);

        String expectedResult = "1,2,3\n1,2,3\n";

        if (result.equals(expectedResult)) {
            System.out.println("OK");
        } else {
            System.out.println("Fail");
        }

    }


}
