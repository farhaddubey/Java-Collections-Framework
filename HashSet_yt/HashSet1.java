import java.util.HashSet;
import java.util.Iterator;

public class HashSet1{
    public static void main(String[] args){
        HashSet<String> set1=new HashSet<>();
        set1.add("WikiGalaxy");
        set1.add("WikiCode");
        set1.add("WikiStacks");
        set1.add("WikiStacks");
        set1.add("WikiStacks");
        set1.add("WikiStacks");
        HashSet<String> set2=new HashSet<>();
        set2.add("WikiHousing");
        set2.add("WikiPlay");
        set2.add("WikiFreeEducation");
        System.out.println(set2);
        System.out.println(set1);
        set1.addAll(set2);
        System.out.println("Printing elements after adding set2 with set1");
        set1.remove("WikiPlay");
        set1.removeAll(set2);
        set1.clear();
        Iterator itr=set1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(set1);
    }
}