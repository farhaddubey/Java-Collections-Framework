import java.util.*;
class Book implements Comparable<Book>{
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
    public int compareTo(Book b){
        if(id>b.id){
            return 1;

        }else if(id<b.id){
            return -1;
        }else{
            return 0;
        }
    }
}
// Queue is interface like List 
public class LinkedList{
    public static void main(String[] args){
        Queue<Book> queue=new PriorityQueue<>();
        Book b1=new Book(121, "Let us C", "Yashant kanetkar", "BPB", 8);
        Book b2=new Book(121, "Let us C", "Yashant kanetkar", "BPB", 8);
        Book b3=new Book(121, "Let us C", "Yashant kanetkar", "BPB", 8);
        Book b4=new Book(121, "Let us C", "Yashant kanetkar", "BPB", 8);
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);
        queue.add(b4);
        System.out.println("Traversing the queue elements: ");
        for (Book b: queue){
            System.out.prinlnt(b.id+''+b.name+''+b.author+''+b.publisher+''+b.quantity);
        }
        queue.remove();
        System.out.println("After removing one book element: ");
    }
}