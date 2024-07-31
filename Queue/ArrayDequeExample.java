import java.util.ArrayDeque;
import java.util.Deque; 

public class ArrayDequeExample{
    public static void main(String[] args){
        //Creating Deque and Adding elements
        Deque<String> deque=new ArrayDeque<String>();
        deque.add("Ravi");
        deque.add("Vijay");
        deque.add("Ajay");
        //Traversing Elements 
        for(String str: deque){
            System.out.println(str);
        }
    }
}