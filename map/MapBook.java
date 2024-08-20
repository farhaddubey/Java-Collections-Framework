import java.util.Map;
import java.util.HashMap;

class Book{
    int id;
    String name, author, publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;
    }
}

public class MapBook{
    public static void main(String[] args){
        Map<Integer, Book> map=new HashMap<>();
        Book b1=new Book(101, "Let US C", "Yashwant kanetkar", "BPB", 8);
        Book b2=new Book(101, "Let US C", "Yashwant kanetkar", "BPB", 8);
        Book b3=new Book(101, "Let US C", "Yashwant kanetkar", "BPB", 8);
        Book b4=new Book(101, "Let US C", "Yashwant kanetkar", "BPB", 8);
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);
        for(Map.Entry<Integer, Book> entry:map.entrySet()){
            int key=entry.getKey();
            Book b=entry.getValue();
            System.out.println("The key is : "+key);
            System.out.println("Book Details: "+b.id+""+b.name+""+b.author+""+b.publisher+""+b.quantity);
        }
        
    }
}