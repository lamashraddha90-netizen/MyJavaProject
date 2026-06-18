import java.io.*;

public class ConfigLoader {
    public static void main(String[] args) {

        try {
            readConfig();
        } catch (FileNotFoundException e) {
            createDefaultConfig();
        }
    }

    // Try reading file
    static void readConfig() throws FileNotFoundException {
        FileReader fr = new FileReader("config.txt");
        System.out.println("Config file loaded successfully.");
    }

    // Create default file
    static void createDefaultConfig() {
        try (FileWriter fw = new FileWriter("config.txt")) {
            fw.write("theme=light\n");
            fw.write("volume=70\n");
            fw.write("language=en\n");

            System.out.println("Default config file created.");
        } catch (IOException e) {
            System.out.println("Error creating config file.");
        }
    }
}