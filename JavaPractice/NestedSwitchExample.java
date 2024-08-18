import java.util.*;

public class NestedSwitchExample{
    public static void main(String[] args){
        //C-CSE E-ECE M-Mechanical
        char branch='C';
        int collegeYear=4;
        switch(collegeYear){
            case 1:
                System.out.println("English, Maths, Science");
                break;
            case 2:
                switch(branch){
                    case 'C':
                        System.out.println("Oprating System, Java, Data Structure");
                        break;
                    case 'E':
                        System.out.println("Microprocessor, Logic Switching Theory");
                        break;
                    case 'M':
                        System.out.println("Manufacturing Machines");
                        break;
                }
                break;
            case 3:
                switch(branch){
                    case 'C':  
                        System.out.println("Computer Organization, MultiMedia");  
                        break;  
                    case 'E':  
                        System.out.println("Fundamentals of Logic Design, Microelectronics");  
                        break;  
                    case 'M':  
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");  
                        break;  
                }
                break;
            case 4:
                switch(branch){
                    case 'C':  
                        System.out.println("Computer Organization, MultiMedia");  
                        break;  
                    case 'E':  
                        System.out.println("Fundamentals of Logic Design, Microelectronics");  
                        break;  
                    case 'M':  
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");  
                        break;  
                }
                break;
        }
    }
}