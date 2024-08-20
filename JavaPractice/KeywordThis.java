import java.util.*;

// class Student{
//     int rollno;
//     String name;
//     float fee;
//     Student(int rollno, String name, float fee){
//         this.rollno=rollno;
//         this.name=name;
//         this.fee=fee;
//     }
//     //this is requied if & only if the instance variable and local variables are same. 

//     Student(no, fullname, money){
//         rollno=no;
//         name=fullname;
//         fee=money;
//     }
// }

class A5{
    void m(){
        System.out.println(this);
    }
}
public class KeywordThis{
    public static void main(String[] args){
        A5 obj=new A5();
        System.out.println(obj); //prints the reference id of A5's obj
        obj.m();
        // Student s1=new Student(111, "Anukur", 5000f);

    }
}


