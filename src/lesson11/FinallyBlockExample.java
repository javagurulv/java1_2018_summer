package lesson11;

public class FinallyBlockExample {

    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("Good by!");
        }
    }

}
