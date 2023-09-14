import java.util.ArrayDeque;
import java.util.Deque;

public class Demo2 {
    public static void main(String[] args) {

        Deque<Integer> myDequeDeque = new ArrayDeque<>();
        myDequeDeque.push(10); 
        myDequeDeque.offer(20);
        myDequeDeque.offer(30);
        myDequeDeque.push(40);
        myDequeDeque.offer(50);
        myDequeDeque.offer(60);
        System.out.println(myDequeDeque);
        myDequeDeque.pop(); //poll first
        myDequeDeque.poll();//poll first
        System.out.println(myDequeDeque);
        
        
    }
}
