package lesson9.electronic_device;

// kontract elektricheskoro ustroistva,
// chto mozno sdelatj s elektricheskim ustroistvom
public interface ElectronicDevice {

    void voltageOn(); // mi mozem podatj na nego elektrichestvo

    void voltageOff(); // mi mozem vikljucitj podachu elektrichestva

    void shortCircuit(); // mozet proizoiti korotkoe zamikanie

    boolean isTurnedOn();

    boolean isTurnedOff();

    boolean isBroken();

}
