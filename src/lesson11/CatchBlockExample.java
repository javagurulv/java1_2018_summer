package lesson11;

public class CatchBlockExample {

    public static void main(String[] args) {
        try {
            throw new Exception("I am exception");
        } catch (Exception e) {
            System.out.println("Exception message:" + e.getMessage());
        }
    }

}
