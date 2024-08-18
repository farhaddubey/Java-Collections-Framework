Java allows us to use four wrapper classes: Byte, Short, Integer and Long in switch statement.
import java.util.*;

public class WrapperInSwitch{
    public static void main(String[] args){
        Integer age=18;
        switch(age){
            case (16):
                System.out.println("U r under 18");
                break;
            case (18):
                System.out.println("You are eligible for Vote");
                break;
            case (65):
                System.out.println("You are a senior citizen");
                break;
            default:
                System.out.println("Provide the valid age");
                break;
        }
    }
}