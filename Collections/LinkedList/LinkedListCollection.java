import java.util.*;

public class LinkedListCollection{
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<>();
        list.add("WikiGlaaxy");
        list.add("WikiCodes");
        list.add("WikiHow");
        list.add("WikiNews");

        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}