abstract class StorageUnit {
    int Id;
    double capacity;
    //construct
    StorageUnit (int Id, double capacity)
    {
        this.Id = Id;
        this.capacity = capacity;
    }
    void displayInfo()
    {
        System.out.println("id " + Id);
        System.out.println("capacity" + capacity);
    }
}
