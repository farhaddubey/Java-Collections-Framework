import java.util.Queue; 
import java.util.PriorityQueue; 

public class PriorityQueueExample{
    public static void main(String[] args){
        Queue<Integer> priorityQueue=new PriorityQueue<>();
        // Adding elements 
        priorityQueue.add(20); 
        priorityQueue.add(30); 
        priorityQueue.add(40);
        priorityQueue.add(1); 
        priorityQueue.add(5);  

        System.out.println(priorityQueue);
        //
    }
}