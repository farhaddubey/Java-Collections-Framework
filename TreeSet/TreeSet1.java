import java.util.TreeSet;
import java.util.*;

public class TreeSet1{
    public static void main(String[] args){
        TreeSet<String> set=new TreeSet<>();
        set.add("Ram");
        set.add("Sham");
        set.add("Jadu");
        set.add("Madhu");
        set.add("Ram");
        System.out.println(set);
        Iterator i=set.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("Lowest Value: "+set.pollFirst());
        System.out.println("Highest Value: "+set.pollLast());
        
    }
}