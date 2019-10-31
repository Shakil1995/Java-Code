
package temperature_converter;

import java.util.Scanner;


public class Temperature_Converter {

   
    public static void main(String[] args) 
    {
        /*Scanner input=new Scanner (System.in);
        
        double C;
        double F;
        System.out.println("enter the calcias :");
        C=input.nextDouble();
        
        F=(1.8*C)+32;
        System.out.println("Celsius to Fahernheit  : " +F);
        
        */
        
        Scanner input=new Scanner (System.in);
        
        double C;
        double F;
        System.out.println("enter the Fahernheit :");
        F=input.nextDouble();
           C=(0.56*F)-32;
        System.out.println("Fahernheit to Celsius  : " +C);
        
      
    }
    
}
