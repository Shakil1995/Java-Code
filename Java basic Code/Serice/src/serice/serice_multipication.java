
package serice;

import java.util.Scanner;


public class serice_multipication {
    
   
        
     public static void main(String[] args) {
        
        
        Scanner input =new Scanner(System.in);
        int n;
        int sum=1;
        System.out.println("enter the value : ");
        n=input.nextInt();
    
    
        for (int i = 1; i <=n; i =i+1)
        {
        
                 System.out.print(i+ " ");
             sum = sum* i;
       
            
      
            
             }
        System.out.println(" ");
        
        System.out.println("sum : " +sum);
        
        
        
        
    }
    
}
