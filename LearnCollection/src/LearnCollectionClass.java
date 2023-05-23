import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(13);
        list.add(5);
        list.add(78);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list,5));
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
