package lesson9;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LigthBulbTest {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        LigthBulb bulb = new LigthBulb(1);
        bulb.voltageOn();
        bulb.voltageOff();
        checkTestResult(bulb.isBroken(), "Test 1");

        String bulbString = bulb.toString();
        System.out.println(bulbString);

        System.out.println(bulb);
    }

    public static void equalsTest() {
        LigthBulb bulb1 = new LigthBulb(1);
        LigthBulb bulb2 = new LigthBulb(1);
        checkTestResult(bulb1.equals(bulb2), "EQUALS");

        LigthBulb bulb3 = new LigthBulb(2);
        checkTestResult(!bulb2.equals(bulb3), "EQUALS");

        checkTestResult(bulb1.equals(bulb1), "EQUALS");

        Random rnd = new Random();
        checkTestResult(!bulb1.equals(rnd), "EQUALS");
    }

    public static void test2() {
        LigthBulb bulb1 = new LigthBulb(1);
        LigthBulb bulb2 = new LigthBulb(1);

        Set<LigthBulb> uniqBulbs = new HashSet<>();
        uniqBulbs.add(bulb1);
        uniqBulbs.add(bulb2);
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
