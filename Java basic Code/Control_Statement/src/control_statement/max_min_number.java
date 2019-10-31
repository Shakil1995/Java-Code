
package control_statement;

import java.util.Scanner;

public class max_min_number {
    
    public static void main(String[] args )
    {
    Scanner input=new Scanner  (System.in);
        
        double a;
        
        double b; 
        System.out.println("enter the 1st number ");
        a=input.nextDouble();
        
        System.out.println("enter the 1st number ");
        b=input.nextDouble();
        
        
        System.out.println("MAX number   :  "+( Math.max(a, b)));
        
           System.out.println("MAX number   :  "+( Math.min(a, b)));
        
        
          }
    
}
