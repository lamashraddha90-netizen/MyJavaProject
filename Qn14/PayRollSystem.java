import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PayRollSystem {

    public static void main(String[] args) {

        // array to store all employees in list
        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new FullTime("Ram", 50000));
        staff.add(new Contractor("Sita", 200, 100));

        // write payroll data to file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("payroll_report.txt"))) {

            for (Employee e : staff) {
                String line = e.name + " : " + e.calculatePay();
                bw.write(line);
                bw.newLine();
            }

            System.out.println("Payroll report created");

        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}