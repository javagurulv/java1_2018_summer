package lesson9.electronic_device;

public class ElectronicDeviceSwitcherTest {

    public static void main(String[] args) {
        test1();
        // dopishite ljubie testi kotorie smozete pridumatj
    }

    public static void test1() {
        ElectronicDevice device = new SuperLightBulb(1);
        checkTestResult(device.isTurnedOff(), "TEST 1 - device is turned off");
        ElectronicDeviceSwitcher switcher = new ElectronicDeviceSwitcher();
        switcher.connectElectronicDevice(device);
        switcher.on();
        checkTestResult(device.isTurnedOn(), "TEST 1 - device is turned on");
        switcher.off();
        checkTestResult(device.isBroken(), "TEST 1 - device is broken");
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
