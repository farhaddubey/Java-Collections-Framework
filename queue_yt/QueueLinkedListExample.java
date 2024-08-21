import java.util.Queue;
import java.util.LinkedList; 

public class QueueLinkedListExample{
    public static void main(String[] args){
        Queue<String> queue=new LinkedList<>();
        //Adding elements to queue 
        queue.add("WikiGalaxy");
        queue.add("WikiCode");
        queue.offer("WikiHow");
        queue.offer("WikiNews");
        //Retrieving the 1st elements 
        System.out.println("Fetching 1st element: "+queue.element());
        System.out.println("Fetching 1st element: "+queue.peek());
        System.out.println(queue);

        //Removing elements 
        System.out.println("Removing the head: "+queue.remove());
        System.out.println("Removign the head: "+queue.poll());
        System.out.println(queue);


    }

}