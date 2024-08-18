import java.util.*;

public class Emp{
    int id;
    String name;
    Address address;
    public Emp(int id, String name, Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);

    }
    public static void main(String[] args){
        Address address1=new Address("gzp", "UP", "India");
        Address address2=new Address("gno", "UP", "India");
        Emp e= new Emp(111, "Bima.",address1);
        e.display();
    }
}