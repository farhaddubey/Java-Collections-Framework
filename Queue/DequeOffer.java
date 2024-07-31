import java.util.ArrayDeque;
import java.util.Deque;

public class DequeOffer{
    public static void main(String[] args){
        Deque<String> deque=new ArrayDeque<>();
        deque.offer("Arvind");
        deque.offer("vimal");
        deque.offer("Mukul");
        deque.add("Mnul");
        deque.offerFirst("jai");
        deque.offerFirst("ho");
        System.out.println("After offerFirst Traversal...");
        for(String str: deque){
            System.out.println(str);
        }
        deque.poll();
        System.out.println(deque);
        // deque.pollFirst(); 
        deque.pollLast();
        System.out.println(deque);
    }
}