
package user_input;

import java.util.Scanner;

public class User_input {


    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int shakil;
        int nurul;
        int a;
        int b;
        int c;
        int d;
        System.out.println("enter the value:  ");
        shakil=input.nextInt();
        
          System.out.println("enter the valu 2: ");
                 nurul=input.nextInt();
          
          a=shakil+nurul;
          b=shakil-nurul;
          c=shakil*nurul;
          d=shakil/nurul;
        System.out.println("Add="  +a );
         System.out.println("Sub =" +b);
          System.out.println("Multi="   +c);
           System.out.println("Div= "  +d );
                      
    
     }
}