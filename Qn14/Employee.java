abstract class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    // abstract method to calculate salary
    abstract double calculatePay();
}