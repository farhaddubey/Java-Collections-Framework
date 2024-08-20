import java.util.List;
import java.util.LinkedList;

public class LinkedList1{
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<>();
        list.add("LeetCode"); //---->0
        list.add("WikiCode"); //---->1------>0

        list.add("WIkiGalaxy");
        list.add("WikiTools");
        System.out.println(list);
        
        LinkedList<String> list1=new LinkedList<>();
        list1.add("WikiStacks");
        list1.add("WikiHousing");
        System.out.println("List1 is"+list1);

        System.out.println("Adding the entire List1 with list");
        list.addAll(2, list1);
        list.remove("LeetCode");
        list.remove(0);
        list.removeAll(list1);

        System.out.println("After addition using addAll(): "+list);
    }
}