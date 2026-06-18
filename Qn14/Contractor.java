class Contractor extends Employee {

    double hourlyRate;
    int hours;
    // constructor for name, rate and hours
    Contractor(String name, double rate, int hours) {
        super(name);
        this.hourlyRate = rate;
        this.hours = hours;
    }
    // method to calculate salary
    double calculatePay() {
        return hourlyRate * hours;
    }
}