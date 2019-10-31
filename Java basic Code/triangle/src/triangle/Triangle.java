
package triangle;

import java.util.Scanner;


public class Triangle {

   
    public static void main(String[] args) {
        
        Scanner input=new Scanner (System.in);
        
       double base;
        double height;
        double Triangle;
        
        System.out.println("enter the base :");
        base=input.nextDouble();
        
        System.out.println("enter the height :");
        height=input.nextDouble();
        
        
        Triangle=0.5*base*height;
        
        System.out.println("triangle : " +Triangle);
        
        
       
    }
    
}
