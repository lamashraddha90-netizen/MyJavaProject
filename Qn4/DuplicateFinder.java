import java.util.ArrayList;
public class DuplicateFinder {
    public static void main(String[] args) {
        //array guest list
        ArrayList<String> guests = new ArrayList<>();

        guests.add("shraddha");
        guests.add("anika");
        guests.add("bbsha");
        guests.add("shraddha");
        guests.add("anika");
        guests.add("bbsha");
        System.out.println("Duplicate names:");
//for loop to find the duplicte names
        for (int i = 0; i < guests.size(); i++) {

            for (int j = i + 1; j < guests.size(); j++) {

                if (guests.get(i).equals(guests.get(j))) {

                    System.out.println(guests.get(i));
                    break; //avoid repeating of the dublicate names
                }
            }
        }
    }
}