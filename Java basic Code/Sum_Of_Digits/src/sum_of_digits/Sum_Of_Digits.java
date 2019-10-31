
package sum_of_digits;

import java.util.Scanner;


public class Sum_Of_Digits {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
       //int num;
       int sum=0,temp,rem;
        System.out.println("enter the value : ");
        int num=input.nextInt();
        
        temp=num;
        while(temp!=0)
        {
             rem=temp%10;
             sum=sum+rem;
             temp=temp%10;
        }
        System.out.println(" " +sum);
        
        
          
        
    }
    
}
      
        
        
        
        
        
        
        
        
