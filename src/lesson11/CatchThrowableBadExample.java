package lesson11;

public class CatchThrowableBadExample {

    public static void main(String[] args) {
        try {
            throw new Exception("I am exception");
        } catch (Throwable e) {
            System.out.println(e);
        }
        System.out.println("Program Continue!");
    }

}
