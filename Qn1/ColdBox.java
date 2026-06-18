public class ColdBox extends StorageUnit implements Refrigerated{
    int temperature;
    ColdBox (int Id, double capacity)
    {
        super(Id, capacity);
    }

    @Override
    public void adjustTemp(int t) {
        temperature = t;
        System.out.println("temperature adjust: " + temperature);

    }
}
