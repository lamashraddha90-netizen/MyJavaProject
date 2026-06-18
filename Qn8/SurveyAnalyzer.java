public class SurveyAnalyzer {
    public static void main(String[] args) {

        int[] responses = {
                1, 2, 3, 4, 5,
                1, 2, 2, 3, 4,
                5, 5, 5, 4, 3,
                2, 1, 1, 3, 4,
                5, 2, 3, 4, 1
        };

        int[] freq = new int[6]; // frequency array

        for (int r : responses) {
            freq[r]++; // count each rating
        }

        System.out.println("Survey Results:");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Rating " + i + " = " + freq[i]);
        }
    }
}