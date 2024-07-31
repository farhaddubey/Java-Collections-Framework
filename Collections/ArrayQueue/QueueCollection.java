import java.util.*;

public class QueueCollection{
    public static void main(String[] args){
        // Queue<String> q1=new PriorityQueue();
        // Queue<String> q2=new ArrayDeque();

        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("WikiGalaxy");
        queue.add("WikiPedia");
        queue.add("WikiHow");
        queue.add("WikiJob");
        queue.add("WikiWorld");
        System.out.println("head: "+queue.element());
        System.out.println("head: "+queue.peek());
        System.out.println("Iterating the queue elements");
        Iterator itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("After removing two elements");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

    }
}