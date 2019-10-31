
package serice;

import java.util.Scanner;

public class Serice {

   
    public static void main(String[] args)
    
    {
     Scanner input=new Scanner (System.in);
     
     int n;
     
     int sum=0;
        System.out.println("enter the number : ");
        n=input.nextInt();
        
        for ( int i = 1; i <=n; i= i+2)
                {
            sum=sum+i;
            
            System.out.print(  i+ " " );
           
        }
        System.out.println(" ");
        
         System.out.println(sum);
        
        
    }
    
}
