import java.util.HashMap;

public class HashMapExample{
    public static void main(String[] args){
        HashMap<String, Integer> map=new HashMap<>();
        //Inserting key value pair into the HashMap of String & Integer 
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Guava", 3);
        //Accessing a value using its key 
        System.out.println("Apple Count: "+map.get("Apple"));
        //Checking if a key exists 
        if(map.containsKey("Banana")){
            System.out.println("Banana is present");
        }
        //Iterating through the HashMap 
        for (String key: map.keySet()){
            System.out.println("Key: "+key+ ", value: "+map.get(key));
        }
    }
}