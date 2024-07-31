import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayList3{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        // 3rd index
        list.add(4);
        list.add(5);
        list.set(2, 300);
        list.add(3, 10000);
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(123);
        list1.add(123);
        list1.add(123);
        list.addAll(1, list1);
        System.out.println("Printing 3rd index"+ list.get(3));
        Iterator<Integer> itr=list.iterator();
        // ListIterator
        while(itr.hasNext()){ //T/F
            System.out.println(itr.next());
        }
        // Iterating Reversely
        ListIterator<Integer> itr2=list.listIterator(list.size());
        System.out.println("Printing reversly");
        while(itr2.hasPrevious()){
            Integer i=itr2.previous();  
            System.out.println(i);
        }
        //Using Lambda function
        System.out.println("Printing using Lambda functions: ");
        list.forEach(a->{
            System.out.println(a);
        });
        System.out.println(list);
        // 0th ------------>get()
        System.out.println("Printing using GET: "+list.get(2));
        for(int i=0; i<list.size(); i++){
            System.out.println(i);
        }
    }
}