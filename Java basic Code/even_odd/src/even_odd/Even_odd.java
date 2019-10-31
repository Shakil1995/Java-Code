
package even_odd;

import java.util.Scanner;


public class Even_odd {

   
    public static void main(String[] args)
    
    {
        Scanner input=new Scanner(System.in);
        int a;
        int b;
        int i;
        int c;
        int d;
        System.out.println("Enter the value : ");
        a=input.nextInt();
          System.out.println("Enter the value : ");
        b=input.nextInt();
        
        
        
         for ( i = a; i <= b; i++) {
             
             
            // System.out.println("number : " +i);
             if (i%2==0) {
                 //System.out.println("even "+i);
                 
                 
                     for (  i = a; i <= b; i++)
         {
             if (i%2!=0) {
                 System.out.println( "even "+i+    "   odd " +i);
             }
         }
                 
                 
             }
           
                    }
         
     
             }
    
}
  
            
            
 
        
        
 