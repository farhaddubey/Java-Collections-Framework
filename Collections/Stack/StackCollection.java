import java.util.*;  
public class StackCollection {  
    public static void main(String args[]) {  
        Stack<String> stack = new Stack<String>();  
        stack.push("WikiNews");  
        stack.push("WikiJobs");  
        stack.push("WikiCars");  
        stack.push("WikiStacks");  
        stack.push("WikiTools");  
        System.out.println("Before Popping any element: ");
        for(String wiki: stack){
            System.out.println(wiki);
        }
        stack.pop();  
        System.out.println("After Popping any element: ");

        Iterator<String> itr = stack.iterator();  
        while (itr.hasNext()) {  
            System.out.println(itr.next());  
        }  
    }  
}