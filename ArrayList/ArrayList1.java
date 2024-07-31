// Adding of Elements
import java.util.ArrayList;

public class ArrayList1{
    public static void main(String[] args){
        ArrayList<String> list1=new ArrayList<>();
        list1.add("WikiGalaxy");
        list1.add("WikiCodees");
        list1.add("WikiHow");
        list1.add("WikiHOusing");
        // Removing a Element 
        list1.remove("WikiHow");

        ArrayList<String> list2=new ArrayList<>();
        list2.add("WikiEngn");
        list2.add("CST");
        list2.add("Medical");
        System.out.println("Elements of list2" +list2);

        System.out.println("Adding all elements of list2 with list1");
        list1.addAll(list2);
        System.out.println("After adding"+list1);


        // 1. for Each 
        for(String item: list1){
            System.out.println(item);
        }
        System.out.println("Printing the Entire List: "+list1);
        list1.removeAll(list2);
        System.out.println("Printing list1 after removing all the elements of list2"+list1);
        // 2. for loop 
        // 3. Iterator itr 
        // 4. forEach Lambda
        // 5. forEachRemaining


    }
}