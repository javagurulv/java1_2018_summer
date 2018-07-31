package lesson9;

public class LigthBulb {

    private LightBulbState state;

    private int maxTurnedOnTimes;

    public LigthBulb(int maxTurnedOnTimes) {
        this.state = LightBulbState.OFF;
        this.maxTurnedOnTimes = maxTurnedOnTimes;
    }

    public void voltageOn() {
        if (this.state == LightBulbState.OFF
                && this.maxTurnedOnTimes > 0) {
            this.state = LightBulbState.ON;
            this.maxTurnedOnTimes = this.maxTurnedOnTimes - 1;
        }
    }

    public void voltageOff() {
        if (this.state == LightBulbState.ON) {
            this.state = LightBulbState.OFF;
            if (this.maxTurnedOnTimes == 0) {
                this.state = LightBulbState.BROKEN;
            }
        }
    }

    public boolean isTurnedOn() {
        return this.state == LightBulbState.ON;
    }

    public boolean isTurnedOff() {
        return this.state == LightBulbState.OFF;
    }

    public boolean isBroken() {
        return this.state == LightBulbState.BROKEN;
    }

}
