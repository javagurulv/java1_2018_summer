package lesson9;

public class LigthBulbTest {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        LigthBulb bulb = new LigthBulb(1);
        bulb.voltageOn();
        bulb.voltageOff();
        checkTestResult(bulb.isBroken(), "Test 1");
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
