import java.util.Hashtable;
import java.util.Map;

class Hashtable1{
    public static void main(String[] args){
        Hashtable<Integer, String> htable=new Hashtable<>();
        htable.put(100, "Wiki");
        htable.put(101, "WikiGalaxy");
        htable.put(102, "WikiCode");
        htable.put(103, "WikiStacks");
        htable.put(104, "WikiCars");
        htable.put(105, "WikiBikes");
        htable.put(106, "WikiHow");
        htable.remove(106);
        System.out.println(htable.getOrDefault(101, "Not Found"));
        System.out.println(htable.getOrDefault(106, "Not Found"));
        htable.putIfAbsent(106, "Hey I'm back");

        for(Map.Entry item:htable.entrySet()){
            System.out.println(item.getKey()+" "+item.getValue());
        }
    }
}