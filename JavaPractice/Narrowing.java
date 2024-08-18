import java.util.*;

public class Narrowing{
    public static void main(String[] args){
        float f=10.5f;
        int a=(int)f; //Compile type error from larger---->smallere automatic casting not possible 
        System.out.println(a);
    }
}