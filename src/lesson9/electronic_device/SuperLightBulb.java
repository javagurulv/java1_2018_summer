package lesson9.electronic_device;

public class SuperLightBulb extends ElectronicDeviceImpl {

    private int maxTurnedOnTimes;  // chislo raz kotoroe mozno vkljucitj lampochku do togo kak ona slomaetsja

    public SuperLightBulb(int maxTurnedOnTimes) {
        // eto vizov konstruktora super klassa, v nashem sluchae konstruktora iz klassa ElectronicDeviceImpl
        // pervoi strokoi v konstruktore klassa dolzen idti vizov odnogo iz konstruktorov klassa roditelja
        super();
        this.maxTurnedOnTimes = maxTurnedOnTimes;
    }

    @Override
    public void voltageOn() {
        if (isTurnedOff() && isMaxTurnedOnTimesAvailable()) {
            changeState(ElectronicDeviceState.ON);
            reduceMaxTurnedOnTimes();
        }
    }

    @Override
    public void voltageOff() {
        if (isTurnedOn()) {
            changeState(ElectronicDeviceState.OFF);
            if (isMaxTurnedOnTimesNotAvailable()) {
                changeState(ElectronicDeviceState.BROKEN);
            }
        }
    }

    private boolean isMaxTurnedOnTimesNotAvailable() {
        return this.maxTurnedOnTimes == 0;
    }

    private boolean isMaxTurnedOnTimesAvailable() {
        return this.maxTurnedOnTimes > 0;
    }

    private void reduceMaxTurnedOnTimes() {
        this.maxTurnedOnTimes = this.maxTurnedOnTimes - 1;
    }

}
