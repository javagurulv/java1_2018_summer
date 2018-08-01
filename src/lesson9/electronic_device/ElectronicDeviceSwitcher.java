package lesson9.electronic_device;

import lesson9.SwitcherState;

public class ElectronicDeviceSwitcher {

    private SwitcherState state;
    private ElectronicDevice electronicDevice;

    public ElectronicDeviceSwitcher() {
        this.state = SwitcherState.OFF;
        this.electronicDevice = null;
    }

    public void connectElectronicDevice(ElectronicDevice electronicDevice){
        if (isOff() && isElectronicDeviceNotConnected()) {
            this.electronicDevice = electronicDevice;
        }
    }

    public void on() {
        this.state = SwitcherState.ON;
        if (isElectronicDeviceConnected()) {
            this.electronicDevice.voltageOn();
        }
    }

    public void off() {
        this.state = SwitcherState.OFF;
        if (isElectronicDeviceConnected()) {
            this.electronicDevice.voltageOff();
        }
    }

    public void shortCircuit() {
        this.state = SwitcherState.OFF;
        if (isElectronicDeviceConnected()) {
            this.electronicDevice.shortCircuit();
        }
    }

    public void disconnectElectronicDevice() {
        if (isOff() && isElectronicDeviceConnected()) {
            this.electronicDevice = null;
        }
    }

    private boolean isOff() {
        return this.state == SwitcherState.OFF;
    }

    private boolean isElectronicDeviceConnected() {
        return this.electronicDevice != null;
    }

    private boolean isElectronicDeviceNotConnected() {
        return this.electronicDevice == null;
    }

}
