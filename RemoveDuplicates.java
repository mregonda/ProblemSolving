import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public ArrayList<String> noDuplicates(ArrayList<String> list) {
        HashSet<String> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");

        RemoveDuplicates rd = new RemoveDuplicates();
        ArrayList<String> noDuplicatesList = rd.noDuplicates(list);

        for (String item : noDuplicatesList) {
            System.out.println(item);
        }
    }
}