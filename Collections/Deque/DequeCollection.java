import java.util.*;
public class DequeCollection{
    public static void main(String[] args){
        Deque<String> deque=new ArrayDeque<>();
        deque.add("WikiGalaxy");
        deque.add("WikiHow");
        deque.add("WikiTools");
        for(String wiki:deque){
            System.out.println(wiki);
        }
    }
}