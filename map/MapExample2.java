import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;

class MapExample2{
    public static void main(String[] args){
        Map<Integer, String> map=new HashMap<>();
        map.put(101, "WikiGalaxy");
        map.put(102, "WikiCode");
        map.put(103, "WikiHow");
        map.remove(101);
        map.put(104, "WikiCars");
        map.put(105, "WikiBikes");
        map.put(106, "WikiUniverse");
        System.out.println(map);
        // Traversing Elements
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.entrySet() //Retunes a  set view of the map
        .stream() //Returns a sequential Stream with this collection as its source
        .sorted(Map.Entry.comparingByKey())
        .forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

    }
}