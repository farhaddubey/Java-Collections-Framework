import java.util.*;


public class OperatorLeftShift{
    public static void main(String[] args){
        System.out.println(10<<2); //10*2^2=40
        System.out.println(10<<3); //10*2^3=80
        System.out.println(10>>2); //10/2*2=2.5=2
        System.out.println(20>>2); //20/2*2=5
        System.out.println(20<<2); // implies multiplication by the 2nds arg's power
        System.out.println(20>>2); // implies division
    }
}