import java.util.Map;
import java.util.Hashtable;

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

class BookHash{
    public static void main(String[] args){
        Map<Integer, Book> map=new Hashtable<Integer, Book>();
        Book b1=new Book(1, "C", "C", "C", 100);
        Book b2=new Book(1, "C", "C", "C", 100);
        Book b3=new Book(1, "C", "C", "C", 100);
        Book b4=new Book(1, "C", "C", "C", 100);
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);
        map.put(4, b4);

        for(Map.Entry<Integer, Book> entry: map.entrySet()){
            int key=entry.getKey();
            Book b= entry.getValue();
            System.out.println(key+"Details: ");
            System.out.println(b.id+""+b.name+b.author);
        }


    }
}