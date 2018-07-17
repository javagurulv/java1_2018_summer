package lesson7;

public class Bottle {

    private boolean isOpen;
    private boolean isFull;

    public Bottle() {
        isOpen = true;
        isFull = false;
    }

    public void open() {
        isOpen = true;
    }

    public void close() {
        isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public boolean isClosed() {
        return !isOpen;
    }

    public void fill() {
        if (isOpen) {
            isFull = true;
        }
    }

    public void empty() {
        if (isOpen) {
            isFull = false;
        }
    }

    public boolean isEmpty() {
        return !isFull;
    }

    public boolean isFull() {
        return isFull;
    }

}
