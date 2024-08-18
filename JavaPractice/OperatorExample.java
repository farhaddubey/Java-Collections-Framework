import java.util.*;

public class OperatorExample{
    public static void main(String[] args){
        int x=10;
        System.out.println(x++); //10, 1st priting & then increasing 10-->11
        System.out.println(++x); //1st increasing, then printing
        System.out.println(x);
        System.out.println(x--); //12---->11(12)
        System.out.println(--x); //10
        int a=10, b=20;
        System.out.println(a++ + ++a); //10+11->12 10+12
        System.out.println(b++ + b++); //20+21->41

        b=10;
        boolean c=true;
        boolean d=false;
        System.out.println(~a);
        System.out.println(~b);
        System.out.println(!c);
        System.out.println(!d);

    }
}