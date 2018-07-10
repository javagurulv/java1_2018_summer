package lesson6;

public class AddTwoNumbersTest {

    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        int a = 0;
        int b = 0;
        int result = AddTwoNumbers.addTwoNumbers(a, b);
        if (result == 0) {
            System.out.println("OK");
        } else {
            System.out.println("Fail");
        }
    }

    public static void test2() {
        int a = 1;
        int b = 9;
        int result = AddTwoNumbers.addTwoNumbers(a, b);
        if (result == 10) {
            System.out.println("OK");
        } else {
            System.out.println("Fail");
        }
    }

}
