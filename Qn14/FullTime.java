class FullTime extends Employee {

    double monthlySalary;

    FullTime(String name, double salary) {
        super(name);
        this.monthlySalary = salary;
    }

    double calculatePay() {
        return monthlySalary;
    }
}