// boolean add(obj)
// boolean offer(obj)
// Obj remove()
// Obj poll() 
// Obj element(): used to retrieves, but does not remoove the head of the queue
// Obj peek(): used to retrieves, but does not remove, the head of this queue
// PriorityQueue, ArrayBlockingQueue & LinkedList: 
// NullPointerException is reaised, if any null operation is performed.
import java.util.*;
class TestCollection{
    public static void main(String[] args){
        PriorityQueue<String> queue=new PriorityQueue<>();
        queue.add("Mango");
        queue.add("Lichi");
        queue.add("WikiCode");
        queue.add("WikiGlaxy");
        queue.add("WikiHow");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("Iterating the queue elements: ");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }
        queue.remove();
        queue.poll();
        System.out.println("After calling remove() and poll()"+queue);   
    }
}