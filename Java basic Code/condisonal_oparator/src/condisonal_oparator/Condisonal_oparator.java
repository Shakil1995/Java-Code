
package condisonal_oparator;

import java.util.Scanner;


public class Condisonal_oparator {

    
    public static void main(String[] args) 
    
            
    {
        Scanner input=new Scanner (System.in);
        int x;
        int y;
        int max;
        System.out.println("enter the 1st numer");
        x=input.nextInt();
        System.out.println("enter the 2nd number : ");
        y=input.nextInt();
        
        max=(x>y)?x:y;
        
        System.out.println("find the max value : " +max);
        
      
        
        
    }
    
}
