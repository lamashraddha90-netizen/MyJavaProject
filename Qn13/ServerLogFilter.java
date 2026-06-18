import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class ServerLogFilter {
    public static void main(String[] args) {

        ArrayList<String> errorList = new ArrayList<>();

        try {
            //  file for reading
            File file = new File("server.log");
            Scanner sc = new Scanner(file);

            // read file line by line
            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                // check if line contains ERROR
                if (line.contains("ERROR")) {
                    errorList.add(line);
                }
            }

            sc.close();
            // printing all error lines
            System.out.println("ERROR Logs:");
            for (String e : errorList) {
                System.out.println(e);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}