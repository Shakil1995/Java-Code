
package multiplication_table;

import java.util.Scanner;


public class Multiplication_Table {

   
    public static void main(String[] args) {
        
        Scanner input= new Scanner (System.in);
        int a;
        int b;
        int i;
        int j;
        System.out.println("enter the Multiplication number ");
        a=input.nextInt();
        
         System.out.println("enter the Multiplication number ");
          b=input.nextInt();
          
          System.out.println("\n\n");
        
        
        
             for (i = a; i<= b; i++) {
                 
                 for ( j = 1; j <= 10; j++) {
                     System.out.println( i + " X " + j+ "  =   " +i*j );
                     
                 }
                 System.out.println("\n\n");
                     
          
             
         
            
        }
            
        
        
    }
    
}
