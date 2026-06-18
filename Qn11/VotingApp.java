public class VotingApp {

    // method to checks age
    static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You are not eligible to vote (age must be 18+).");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
    //main method
    public static void main(String[] args) {

        int age = 20;

        try {
            checkEligibility(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}