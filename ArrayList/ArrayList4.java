import java.util.*;


public class ArrayList4{
    public static void main(String[] args){
        ArrayList<Student> stulist=new ArrayList<>();
        Student stu1=new Student(1, "Farhad Dubey");
        Student stu2=new Student(2, "WikiGalaxy");
        Student stu3=new Student(3, "WikiCodes");
        stulist.add(stu1);
        stulist.add(stu2);
        stulist.add(stu3);
        stulist.add(new Student(1, "Farhad Dubey as a Teacher"));
        for(Student st: stulist){
            System.out.println("The roll no is: "+st.rollno+"Name is : "+st.name);
        }
    }
}