public class EBook implements Searchable {
    @Override
    public void search(String keyword) {
        System.out.println("Searching '" + keyword + "' in EBook database");
    }
}