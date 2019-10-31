
package array;

import java.util.Arrays;


public class sorting_array {
    public static void main(String[] args) {
        
        int[] number={20,80,-152,4000,50};
        
        Arrays.sort(number);
        
        System.out.println(" Ascending :- ");
        for (int i = 0; i < +5; i++) {
            
            System.out.print(" " +number[i]);           
        }
        
        System.out.println(" \n\n");
        
        
         System.out.println(" Dscending :- ");
         
        for (int i = 4; i >=0; i--) {
            
            System.out.print(" " +number[i]);           
        }
        
        
    
        System.out.println(" \n\n");
    }
    
}
