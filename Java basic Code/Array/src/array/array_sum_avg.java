
package array;

import java.util.Scanner;


public class array_sum_avg {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double[] number =new double[5];
        double sum;
       
        
        System.out.println("enter the value  : ");
        
        
        
        
              number[0] = input.nextDouble();
              number[1] = input.nextDouble();
              number[2] = input.nextDouble();
              number[3] = input.nextDouble();
              number[4] = input.nextDouble();
                
                
               
        
             sum=number[0]+number[1]+number[2]+number[3]+number[4];
                
                System.out.println("total sum all array : "+sum);
    }
    
}
