import java.util.*;

public class SwitchExample{
    public static void main(String[] args){
        int number=20;
        switch(number){
            case 10:
                System.out.println("10");
                break;
            case 11:
                System.out.println("20");
                break;
            case 15:
                System.out.println("30");
                break;
            case 20:
                System.out.println("35");
                break;
            default:
                System.out.println("Not in all above");
        }
    }
}