public class DeviceMain {
    static void main(String[] args) {
        ElectronicDevice[] devices =
                {
                        new Printer(),
                        new Scanner()
                };
        for(ElectronicDevice d : devices)
        {
            d.powerOn();
        }
    }
}
