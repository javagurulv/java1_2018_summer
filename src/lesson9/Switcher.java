package lesson9;

public class Switcher {

    private SwitcherState state;
    private LigthBulb bulb;

    public Switcher() {
        this.state = SwitcherState.OFF;
        this.bulb = null;
    }

    public void connectLightBulb(LigthBulb bulb) throws BulbAlreadyConnectedException {
        if (this.bulb != null) {
            throw new BulbAlreadyConnectedException(this.bulb);
        }
        if (this.state == SwitcherState.OFF) {
            this.bulb = bulb;
        }
    }

    public void on() {
        this.state = SwitcherState.ON;
        if (this.bulb != null) {
            this.bulb.voltageOn();
        }
    }

    public void off() {
        this.state = SwitcherState.OFF;
        if (this.bulb != null) {
            this.bulb.voltageOff();
        }
    }

    public void disconnectLigthBulb() {
        if (this.state == SwitcherState.OFF
                && this.bulb != null) {
            this.bulb = null;
        }
    }

}
