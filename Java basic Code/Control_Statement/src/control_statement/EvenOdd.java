
package control_statement;

import java.util.Scanner;


public class EvenOdd {
    
    
    
    public static void main(String[] args)
    {
    
    Scanner input=new Scanner(System.in);
    int number;
    
    System.out.println("enter the numer ");
    number=input.nextInt();
    
    if (number%2==0)
    {
    System.out.println("this numar is even");
    }
    else
    {
    System.out.println("this numbere is odd");
    }
        
    
    }
    
}
