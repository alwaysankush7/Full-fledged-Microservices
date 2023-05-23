import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Parrot");
        animals.push("Peacock");
        System.out.println(animals);

        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals);
    }
}
