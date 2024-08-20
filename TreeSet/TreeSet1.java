import java.util.*;

public class TreeSet1{
    public static void main(String[] args){
        TreeSet<Integer> set=new TreeSet<>();
        set.add(20);
        set.add(1);
        set.add(15);
        set.add(599);
        set.add(40);
        set.add(2);
        set.add(5);
        set.add(5);
        set.add(0);
        set.add(0);
        TreeSet<Integer> set2=new TreeSet<>();
        set2.add(20);
        set2.add(21);
        set2.add(22);
        System.out.println(set);
        System.out.println("Element of set2"+set2);
        //Adding all the elements of set2 with set
        set.addAll(set2);
        System.out.println("After adding all the elements of set2 with set"+set);
        System.out.println("Checking ceiling method"+set.ceiling(16));

        Iterator itr=set.iterator();
        System.out.println("Iterating using Iterator");
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }
        Iterator itr2=set.descendingIterator();
        System.out.println("Iterating using Descending Iterator");
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println(set.descendingSet());
        System.out.println(set.headSet(1000));
        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());
        System.out.println(set.subSet(5, 40));
        System.out.println(set.contains(41));
        System.out.println("Checking isEmpty"+set.isEmpty());
        System.out.println("THe size of the set is: "+set.size());
        set.remove(0);
        set.remove(1);
        set.remove(2);
        set.remove(5);
        set.remove(15);
        set.remove(20);
        set.remove(21);
        set.remove(22);
        set.remove(40);
        set.remove(599);
        System.out.println("Chekcing if empty or not: "+set.isEmpty());
        System.out.println(set);

        


    }
}