import java.util.ArrayDeque;
import java.util.Deque;

public class Demo1 {
    public static void main(String[] args) {

        Deque myDeque = new ArrayDeque<>();
        // myDeque.offer(10);
        // myDeque.push(20);
        // myDeque.offer(30);
        // myDeque.push(40);
        // System.out.println(myDeque);

        myDeque.offerFirst(10);
        myDeque.offerFirst(20);
        myDeque.offerFirst(30);
        myDeque.offerFirst(40);
        System.out.println(myDeque);
        System.out.println(myDeque.peek());
        myDeque.pollFirst();
        System.out.println(myDeque);
        System.out.println(myDeque.peek());

        
    }
}