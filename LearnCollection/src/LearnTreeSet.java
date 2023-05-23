import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {
        //TreeSet  all property are same as set but data will be in sorted order(asc)
        //here internally there are implementing binarysearch hence time complexity
        // will be log(n) but other set time complexity will be log(n)
        Set<Integer> ts= new TreeSet<>();
        ts.add(45);
        ts.add(23);
        ts.add(67);
        System.out.println(ts);


    }
}
