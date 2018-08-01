package lesson9;

public class LigthBulb extends Object {

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

    @Override
    public String toString() {
        return "LightBulb state = " + this.state
                + " maxTurnedOnTimes = " + this.maxTurnedOnTimes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LigthBulb bulb = (LigthBulb) o;

        if (maxTurnedOnTimes != bulb.maxTurnedOnTimes) return false;
        return state == bulb.state;
    }

    @Override
    public int hashCode() {
        int result = state != null ? state.hashCode() : 0;
        result = 31 * result + maxTurnedOnTimes;
        return result;
    }
}
