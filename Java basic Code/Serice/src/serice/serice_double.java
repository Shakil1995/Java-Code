
package serice;

import java.util.Scanner;


public class serice_double {
    
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        double n;
        double sum=0;
        System.out.println("enter the value : ");
        n=input.nextDouble();
    
    
        for (double i = 1.5; i <=n; i =i+1)
        
        {
            sum=sum+i;
            System.out.print(i+ " ");
            
      
            
             }
        System.out.println(" ");
        
        System.out.println("sum : " +sum);

        
            
            
       
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
}
