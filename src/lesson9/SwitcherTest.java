package lesson9;

public class SwitcherTest {

    public static void main(String[] args) {
        LigthBulb bulb1 = new LigthBulb(1);
        LigthBulb bulb2 = new LigthBulb(1);

        Switcher switcher1 = new Switcher();
        Switcher switcher2 = new Switcher();

        switcher1.connectLightBulb(bulb1);

        test1();
    }

    public static void test1() {
        LigthBulb bulb = new LigthBulb(1);
        Switcher switcher = new Switcher();
        switcher.connectLightBulb(bulb);
        switcher.on();
        switcher.off();
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
