import java.util.*;

public class HashSetCollection{
    public static void main(String[] args){
        HashSet<String> set=new HashSet<>();
        set.add("Wiki");
        set.add("WIkiGalaxy");
        set.add("WikiHow");
        set.add("WikiCodes");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
}
}