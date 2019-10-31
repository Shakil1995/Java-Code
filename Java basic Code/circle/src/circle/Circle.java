
package circle;

import java.util.Scanner;

public class Circle {

   
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
       double R;
        double pai=3.1416;
        double circle;
        
        System.out.println("enter the radians : ");
        R=input.nextDouble();
        
        //System.out.println("pic" );
        //pai=input.nextDouble();
        
        
        circle =pai*R;
        
        System.out.println("cricle :" +circle);
        
        
       
    }
    
}
