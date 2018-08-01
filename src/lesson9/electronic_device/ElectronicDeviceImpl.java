package lesson9.electronic_device;

public class ElectronicDeviceImpl implements ElectronicDevice {

    // protected oznachaet, chto eto svoistvo budet dostupno vsem potomkam etogo klassa
    // toestj iz ljubogo potomka etogo klassa mozno budet obratitsja naprjamuju k etomu svoistvu i ego pomenjatj naprimer
    protected ElectronicDeviceState state;


    public ElectronicDeviceImpl() {
        this.state = ElectronicDeviceState.OFF;
    }

    public void voltageOn() {

    }

    public void voltageOff() {

    }

    @Override
    public void shortCircuit() {
        this.state = ElectronicDeviceState.BROKEN;
    }

    @Override
    public boolean isTurnedOn() {
        return this.state == ElectronicDeviceState.ON;
    }

    @Override
    public boolean isTurnedOff() {
        return this.state == ElectronicDeviceState.OFF;
    }

    @Override
    public boolean isBroken() {
        return this.state == ElectronicDeviceState.BROKEN;
    }

    protected void changeState(ElectronicDeviceState newState) {
        this.state = newState;
    }

}
