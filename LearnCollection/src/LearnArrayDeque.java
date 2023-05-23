import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<Integer>();
        //it can take input from both end and also we can poll elements from both end
        adq.offer(12);
        adq.offerFirst(23);
        adq.offerLast(45);
        adq.offerFirst(67);
        System.out.println(adq);
        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
        System.out.println(adq);
    }
}
