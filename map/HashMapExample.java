import java.util.Map;
import java.util.Comparator;
import java.util.HashMap;

public class HashMapExample{
    public static void main(String[] args){
        HashMap<Integer, String> map=new HashMap<Integer, String>();
        map.put(1, "Mango");//it'll be replaced by the next duplicate value
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");
        map.put(3, "");
        map.put(1, "Grapes");
        map.putIfAbsent(103, "Gaurav");
        map.putIfAbsent(103, "Hello");
        map.putIfAbsent(3, "Hi");
        map.remove(3);
        map.remove(1, "Grapes");
        map.remove(103);
        map.replaceAll((k, v)->"Ajay");
        System.out.println("Iterating Hashmaps..");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}