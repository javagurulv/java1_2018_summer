package lesson7;

public class BottleTest {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
    }

    public static void test1() {
        Bottle b = new Bottle();
        if (b.isOpen()) {
            System.out.println("Test 1 OK");
        } else {
            System.out.println("Test 1 FAIL");
        }
    }

    public static void test2() {
        Bottle b = new Bottle();
        b.close();
        if (!b.isOpen()) {
            System.out.println("Test 2 OK");
        } else {
            System.out.println("Test 2 FAIL");
        }
    }

    public static void test3() {
        Bottle b = new Bottle();
        b.close();
        b.open();
        if (b.isOpen()) {
            System.out.println("Test 3 OK");
        } else {
            System.out.println("Test 3 FAIL");
        }
    }

    public static void test4() {
        Bottle b = new Bottle();
        if (b.isEmpty()) {
            System.out.println("Test 4 OK");
        } else {
            System.out.println("Test 4 FAIL");
        }
    }

    public static void test5() {
        Bottle b = new Bottle();
        b.fill();
        b.close();
        b.empty();
        if (b.isFull()) {
            System.out.println("Test 5 OK");
        } else {
            System.out.println("Test 5 FAIL");
        }
    }
}
