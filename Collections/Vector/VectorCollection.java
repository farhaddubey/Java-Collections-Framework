import java.util.*;

public class VectorCollection{
    public static void main(String[] args){
        Vector<String> vlist= new Vector<>();
        vlist.add("WikiGalaxy");
        vlist.add("WikiCodes");
        vlist.add("WikiHow");
        for(String wiki: vlist){
            System.out.println(vlist);
        }
    }
}