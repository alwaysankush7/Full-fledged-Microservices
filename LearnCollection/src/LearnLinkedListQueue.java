import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("learn");
        queue.offer("learn2");
        //if we are using add then it will also add but if task is unsuccessful it will then it will through exception
        queue.add("learn3");
        System.out.println(queue);
        queue.add("");
        //to see which element is goint to poll
        System.out.println(queue.peek());
        System.out.println(queue);
        queue.remove("learn");
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
    }
}
