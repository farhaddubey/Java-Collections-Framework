import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueExample{
    public static void main(String[] args){
        Queue<Integer> priorityQueue=new PriorityQueue<>();
        //Adding eleemnt to the priority queue
        priorityQueue.offer(10);
        priorityQueue.offer(5);
        priorityQueue.offer(0);
        priorityQueue.offer(12);
        priorityQueue.offer(15);
        priorityQueue.offer(20);
        //Elements will be ordered according to their natural ordering 
        System.out.println("Head: "+priorityQueue.peek());
        System.out.println("Head: "+priorityQueue);
        //Removing elements in Priorityqueue 
        while(!priorityQueue.isEmpty()){
            System.out.println("Removed: "+priorityQueue.poll());
        }

    }
}