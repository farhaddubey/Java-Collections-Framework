import java.util.LinkedList;

public class LinkedList2{
    public static void main(String[] args){
        LinkedList<Integer> list1=new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(3);
        list1.add(3);
        list1.add(3);
        System.out.println(list1);
        System.out.println("Printing the 1st element: "+list1.element());
        System.out.println("Element at 5th"+list1.get(5));
        System.out.println("Element at 1st"+list1.getFirst());
        System.out.println("Element at Last"+list1.getLast());
        System.out.println("Element at 1st position using Peek()"+list1.peek());
        System.out.println("Element at 1st position using Peek()"+list1.peekFirst());
        System.out.println("Element at 1st position using Peek()"+list1.peekLast());
        System.out.println(list1);
        System.out.println(list1.pop());
        list1.set(0, 1000);
        System.out.println(list1.peek());
    }
}