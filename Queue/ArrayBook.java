import java.util.Deque;
import java.util.ArrayDeque;

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
public class ArrayBook{
    public static void main(String[] args){
        Deque<Book> set=new ArrayDeque<Book>();
        set.add(new Book(101, "Let US C", "Yashant Kanetkar", "BPB", 8));
        set.add(new Book(101, "Let US C", "Yashant Kanetkar", "BPB", 8));
        set.add(new Book(101, "Let US C", "Yashant Kanetkar", "BPB", 8));
        for (Book b: set){
            System.out.println(b.id+""+b.name+""+b.author+""+b.publisher+""+b.quantity);
        }
        
    }
}