package lesson9.electronic_device;

// Chainik mozno vkljuchatj i vikljuchatj skoljko ugodno raz!
public class TeaPot extends ElectronicDeviceImpl {

    public TeaPot() {
        // eto vizov konstruktora super klassa, v nashem sluchae konstruktora iz klassa ElectronicDeviceImpl
        // pervoi strokoi v konstruktore klassa dolzen idti vizov odnogo iz konstruktorov klassa roditelja
        // vizov super() sdesj ne objazateljnij, ego mozno i ne ukazivatj, v takom sluchae kompiljator dobavit ego sam v moment kompiljacii vashego koda
        super();
    }

    @Override
    public void voltageOn() {
        // realizujte etot metod sami
    }

    @Override
    public void voltageOff() {
        // realizujte etot metod sami
    }

}
