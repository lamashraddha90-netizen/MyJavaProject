public class Electronic {
    private String name;
    private double price;

    public Electronic(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double pct) {
        price = price - (price * pct / 100);
    }

    public void display() {
        System.out.println(name + " : " + price);
    }
}
