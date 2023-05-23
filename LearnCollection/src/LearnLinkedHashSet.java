import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> hs = new LinkedHashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(4);
        System.out.println(hs);
        //Same as hashset but here oreder will not be differ order will be the way you will insert the elements
    }
}
