
package factorial_number;

import java.util.Scanner;


public class Factorial_Number {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner (System.in);
        int number ;
        int fact=1;
        
        System.out.println("enter the number : ");
        number=input.nextInt();
        
        for (int i = number; i >= 1; i--) {
            fact=fact*i;
          }   
        
        System.out.println( "factorial of " +number+ " = "  +fact);
            
       
        
        
    }
        
    
}
