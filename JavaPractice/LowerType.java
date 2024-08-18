import java.util.*;

public class LowerType{
    public static void main(String[] args){
        byte a=10;
        byte b=10;
        byte c=(byte)(a+b); //Compile Time Error; cause a+b=20 will be an int
        System.out.println(c);
    }
}