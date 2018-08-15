package lesson11;

public class MultipleCatchBlocksExample {

    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (NumberFormatException e) {

        } catch (ArrayIndexOutOfBoundsException e) {

        } catch (Exception e) {

        } catch (Throwable e) {

        }
    }

}
