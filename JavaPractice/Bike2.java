import java.util.*;


class Vehicle{
    void run(){System.out.println("Vehicle is running");}
    void play(){ 
        System.out.println("System is playing with MAC");
    }
} 
class Bike2 extends Vehicle{
    void run(){
        System.out.println("Bike is running safely");
    }
    void play(){
        System.out.println(
            "Bike is being played on Linux."
        );
    }
    public static void main(String[] args){
        Bike2 obj=new Bike2();
        obj.run();
        obj.play();
    }
}