
package array;

import java.util.Scanner;


public class array_sum_avg_sort {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
  
        double[] num=new double[4];
        
              double sum=0;
        System.out.println("enter the value : ");
        
       
        for (int  i = 0; i <num.length; i++) {
            
             num[i] = input.nextDouble();
            
        }
        
        for (int i = 0; i <num.length; i++) {
            sum=sum+num[i];
           
            
        }
         System.out.println("total sum of array  : "+sum);
        
         double avg=sum/num.length;
         System.out.println("avarge : "+avg);
    
    
        
    
    }
    
}
