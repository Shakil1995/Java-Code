
package primeumber;

import java.util.Scanner;


public class Nth_prime {
    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        int n;
        int m;
        int count=0;
        
        System.out.println("enter the 1st number : ");
        m=input.nextInt();
        
        System.out.println("enter the 1st number : ");
        n=input.nextInt();
        
        for (int i = m; i < n; i++) {
            for (int j = 2; j <= i-1; j++) {
                
                if (i%j==0) {
                    
                    count++;
                    break;
                    
                }
                
            }
            
            if(count==0);
            
                System.out.println(i);
            count=0;
            
        }
        
        
    }
}