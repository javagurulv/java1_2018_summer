package lesson9;

public class SwitcherTest {

    public static void main(String[] args) throws BulbAlreadyConnectedException {
        LigthBulb bulb1 = new LigthBulb(1);
        LigthBulb bulb2 = new LigthBulb(1);

        Switcher switcher1 = new Switcher();
        Switcher switcher2 = new Switcher();

        switcher1.connectLightBulb(bulb1);

        test1();
        test2();
    }

    public static void test1() throws BulbAlreadyConnectedException {
        LigthBulb bulb = new LigthBulb(1);
        Switcher switcher = new Switcher();
        switcher.connectLightBulb(bulb);
        switcher.on();
        switcher.off();
        checkTestResult(bulb.isBroken(), "Test 1");
    }

    public static void test2() {
        LigthBulb bulb1 = new LigthBulb(1);
        LigthBulb bulb2 = new LigthBulb(1);
        Switcher switcher = new Switcher();
        try {
            switcher.connectLightBulb(bulb1);
            switcher.connectLightBulb(bulb2);
            checkTestResult(false, "Test 2");
        } catch (BulbAlreadyConnectedException e) {
            checkTestResult(e.getAlreadyConnected() == bulb1, "Test 2");
        }
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
