import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class DailySalesLog {
    public static void main(String[] args) {

        // Array of 7 days sales
        double[] sales = {120.5, 150.0, 98.75, 200.0, 175.25, 160.0, 190.5};

        // create and write data into file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("weekly_sales.txt"))) {
            // loop through array and write each value
            for (double s : sales) {
                bw.write(String.valueOf(s));
                bw.newLine();
            }

            System.out.println("Sales data saved successfully");

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}