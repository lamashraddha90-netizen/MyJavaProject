public class Inventory {
    public static void main(String[] args) {

        Electronic[] inventory = new Electronic[3];

        inventory[0] = new Electronic("Laptop", 2000);
        inventory[1] = new Electronic("Phone", 500);
        inventory[2] = new Electronic("Tablet", 300);

        // 10% discount to all products
        for (Electronic e : inventory) {
            e.applyDiscount(10.0);
        }

        // Display prices
        for (Electronic e : inventory) {
            e.display();
        }
    }
}