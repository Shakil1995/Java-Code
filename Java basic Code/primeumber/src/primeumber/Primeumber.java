
package primeumber;

import java.util.Scanner;

public class Primeumber {

   
    public static void main(String[] args) 
    {
        
        Scanner input=new Scanner(System.in);
        int num;
        int count=0;
        System.out.println("enter the value : ");
        num=input.nextInt();

         for (int i = 2; i < num; i++) {
             
             if(num%i==0){
              count++;
              break;
             }
            
        }
         
         if(count==0){
             System.out.println("prime");
         }
         else {
             System.out.println("not prime");
         }
        

       
    }
    }
    
    
        
