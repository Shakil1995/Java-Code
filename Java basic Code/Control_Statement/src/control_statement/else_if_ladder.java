
package control_statement;

import java.util.Scanner;


public class else_if_ladder {
    
   public static void main(String[] args)
   {
   
       Scanner input=new Scanner(System.in);
       int num;
       
       System.out.println("enter the value : ");
       num=input.nextInt();
       
       
       if (num>0)
       {
       System.out.println("prositive");
       }
       
       else if (num<0)
       {
       System.out.println("nagative");
       }
       
       else
       {
       System.out.println("zeero");
       }
       
       
      
       
       
   
   
   }
      
       
   
    
    
    
    
    
}
