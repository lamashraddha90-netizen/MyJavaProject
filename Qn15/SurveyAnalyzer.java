public class SurveyAnalyzer {

    public static void main(String[] args) {

        // sample survey responses (1 to 5)
        int[] responses = {
                1, 2, 5, 3, 4, 2, 1, 5, 3, 3,
                4, 2, 1, 5, 5, 4, 3, 2, 1, 5,
                2, 3, 4, 1, 5, 2, 3, 4, 5, 1,
                2, 3, 4, 5, 1, 2, 3, 4, 5, 1,
                2, 3, 4, 5, 1, 2, 3, 4, 5, 1
        };

        // frequency array (index 1 to 5 use)
        int[] freq = new int[6];

        // count occurrences
        for (int r : responses) {
            freq[r]++;
        }

        // display results
        System.out.println("Survey Results:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Rating " + i + " = " + freq[i]);
        }
    }
}