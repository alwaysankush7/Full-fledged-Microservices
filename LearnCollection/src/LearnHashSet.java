import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    public static void main(String[] args) {
//        Set<Integer> hs = new HashSet<Integer>();
//        hs.add(1);
//        hs.add(2);
//        hs.add(3);
//        hs.add(4);
//        hs.add(4);
//        System.out.println(hs);
        //HashSet  it never contains duplicates value and its order of insertion will vary. Actually it work on hashing like it convert the data into hash form and it looks in the bucket if there is another hashing with same data then it will not take that element.
        //And all the other functionalaty is same as collections

        //Custom Type
        Set<Student> s = new HashSet<Student>();
        s.add(new Student("Ajay",1));
        s.add(new Student("Ankush",2));
        s.add(new Student("MAnish",2));
        System.out.println(s);
        //In the output you can see that manish also printed even though roll no. are the same
        //it just because we are created two different objects and internally equals method will invoke
        //hence we need to override equals method and hash


    }
}
