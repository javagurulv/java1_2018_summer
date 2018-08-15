package lesson9;

public class BulbAlreadyConnectedException extends Exception {

    private LigthBulb alreadyConnected;

    public BulbAlreadyConnectedException(LigthBulb alreadyConnected) {
        this.alreadyConnected = alreadyConnected;
    }

    public LigthBulb getAlreadyConnected() {
        return alreadyConnected;
    }
}
