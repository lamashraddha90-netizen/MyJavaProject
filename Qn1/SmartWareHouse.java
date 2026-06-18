public class SmartWareHouse {
    static void main(String[] args) {
        ColdBox box = new ColdBox(100, 50.2);
        box.displayInfo();
        box.adjustTemp(-1);
    }
}
