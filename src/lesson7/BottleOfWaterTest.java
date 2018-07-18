package lesson7;

public class BottleOfWaterTest {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
    }

    public static void test1() {
        BottleOfWater b = new BottleOfWater();
        checkTestResult(b.isOpen(), "Test 1");
    }

    public static void test2() {
        BottleOfWater b = new BottleOfWater();
        b.close();
        checkTestResult(!b.isOpen(), "Test 2");
    }

    public static void test3() {
        BottleOfWater b = new BottleOfWater();
        b.close();
        b.open();
        checkTestResult(b.isOpen(), "Test 3");
    }

    public static void test4() {
        BottleOfWater b = new BottleOfWater();
        checkTestResult(b.isEmpty(), "Test 4");
    }

    public static void test5() {
        BottleOfWater b = new BottleOfWater();
        b.fill();
        b.close();
        b.empty();
        checkTestResult(b.isFull(), "Test 5");
    }

    private static void checkTestResult(boolean result,
                                        String testName) {
        if (result) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }


}
