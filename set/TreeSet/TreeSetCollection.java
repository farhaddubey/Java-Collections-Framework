import java.util.*;

public class TreeSetCollection{
    public static void main(String[] args){
        TreeSet<String> set=new TreeSet<>();
        set.add("How");
        set.add("How");
        set.add("AbWikiJobs");
        set.add("WikiGalaxy");
        set.add("WikiGalaxy");
        set.add("WikiGalaxy");
        set.add("WikiHousing");
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}