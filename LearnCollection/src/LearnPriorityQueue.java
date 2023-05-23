import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<Integer>();
        pq.offer(45);
        pq.offer(23);
        pq.offer(12);
        //it maintain min heap
        System.out.println(pq);
        //for max heap
        Queue<Integer>pq1=new PriorityQueue<Integer>(Comparator.reverseOrder());
        pq1.offer(12);
        pq1.offer(5);
        pq1.offer(76);
        System.out.println(pq1);

        //And all the properties are same as linked list because both are implemented queue interface
    }
}
