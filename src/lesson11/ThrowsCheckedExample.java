package lesson11;

public class ThrowsCheckedExample {

    public static void main(String[] args) {
        try {
            createData(5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String createData(int times) throws Exception {
        if (times == 5) {
            throw new Exception();
        } else {
            return "data";
        }

    }

}
