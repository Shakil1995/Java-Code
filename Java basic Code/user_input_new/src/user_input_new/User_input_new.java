
package user_input_new;

import java.util.Scanner;


public class User_input_new {

  
    public static void main(String[] args)
    
    {
        
        Scanner input=new Scanner(System.in);
        int a;
        int b;
        int c;
        
        System.out.println("enter the 1st value: ");
        a=input.nextInt();
        System.out.println("enyter the secend value ");
       b=input.nextInt();
       c=a+b;
       System.out.println("new value " +c);
       
       
    }
    
}
