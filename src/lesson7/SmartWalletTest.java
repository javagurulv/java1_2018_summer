package lesson7;

public class SmartWalletTest {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
    }

    public static void test1() {
        SmartWallet wallet = new SmartWallet("1111");
        checkTestResult(
                wallet.getBalance("1111") == 0,
                "TEST 1");
    }

    public static void test2() {
        SmartWallet wallet = new SmartWallet("1111");
        checkTestResult(
                wallet.getBalance("2222") == -1,
                "TEST 2");
    }

    public static void test3() {
        SmartWallet wallet = new SmartWallet("1111");
        wallet.addMoney(100);
        checkTestResult(
                wallet.getBalance("1111") == 100,
                "TEST 3");
    }

    public static void test4() {
        SmartWallet wallet = new SmartWallet("1111");
        wallet.addMoney(100);
        wallet.deduct("1111", 100);
        checkTestResult(
                wallet.getBalance("1111") == 0,
                "TEST 4");
    }

    public static void test5() {
        SmartWallet wallet = new SmartWallet("1111");
        wallet.addMoney(100);
        wallet.deduct("1111", 200);
        checkTestResult(
                wallet.getBalance("1111") == 100,
                "TEST 5");
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
