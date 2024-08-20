import java.util.LinkedHashSet;
class Products{
    int id;
    String prod_name, desc;
    public Products(int id, String prod_name, String desc){
        this.id=id;
        this.prod_name=prod_name;
        this.desc=desc;
    }
}
public class LinkedHashSet1{
    public static void main(String[] args){
        LinkedHashSet<Products> productset=new LinkedHashSet<>();
        Products p1=new Products(1, "WikiGalaxy Choco", "Wiki Choco was so sweat.");
        Products p2=new Products(2, "WikiGalaxy Choco", "Wiki Choco was so sweat.");
        Products p3=new Products(3, "WikiGalaxy Choco", "Wiki Choco was so sweat.");
        productset.add(p1);
        productset.add(p2);
        productset.add(p3);
        productset.add(new Products(4, "WikiGalaxy Choco", "Wiki Choco was so sweat."));
        System.out.println("Entire products are: "+productset);
        for(Products p: productset){
            System.out.println("The id is: "+p.id+"product name is: "+p.prod_name+"Description is: "+p.desc);
        }
        LinkedHashSet<Long> set1=new LinkedHashSet<>();
        set1.add(10l);
        set1.add(12l);
        set1.add(13l);
        set1.remove(12l);
        LinkedHashSet<Long> set2=new LinkedHashSet<>();
        set2.add(20l);
        set2.add(30l);
        set1.addAll(set2);
        System.out.println(set1);
        set1.removeAll(set2);
        System.out.println("After removing"+set1);
    }
}