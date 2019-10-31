
package serice;

import java.util.Scanner;


public class squre {
    public static void main(String[] args) {
        
        
        Scanner input =new Scanner(System.in);
        int n;
        int sum=0;
        System.out.println("enter the value : ");
        n=input.nextInt();
    
    
        for (int i = 1; i <=n; i =i+1)
        {
        
                 System.out.print(i+"X"+i+" ");
             sum = sum+ i*i;
       
            
      
            
             }
        System.out.println(" ");
        
        System.out.println("sum : " +sum);

        
        
        
        
        
        
        
        
        
    }
    
    
}
