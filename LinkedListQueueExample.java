import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample{
    public static void main(String[] args){
        //Queue is a interface
        Queue<String> queue =new LinkedList<>();
        //Adding elements to the queue offer() add()
        queue.add("First");
        queue.offer("Second");
        queue.offer("Third");
        queue.offer("Fourth");
        //Displaying the head of the elements
        System.out.println("Head: "+queue.peek());
        System.out.println("Head: "+queue.element());
        //Removing elements from the queue
        System.out.println("Removed: "+queue.poll());
        System.out.println("Removed: "+queue.poll());
        System.out.println("Removed: "+queue.poll());
        System.out.println("Removed: "+queue.poll());
        //Trying to remove from an empty queue
        System.out.println("Removed: "+queue.poll());


    }
}