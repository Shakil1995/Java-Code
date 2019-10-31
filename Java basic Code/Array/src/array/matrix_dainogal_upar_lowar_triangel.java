
package array;

import java.util.Scanner;

public class matrix_dainogal_upar_lowar_triangel {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter the  matrix  A value : ");
                 
        
        int [][] A=new int[3][3];
        int diagonal=0;
        int upper=0;
        int lower=0;
        
        for (int row = 0; row < 3; row++)
       
        {
           
            for (int col = 0; col < 3; col++) {
                  //System.out.printf("A[%d][%d]  =  " ,row,col);
                 A[row][col]=input.nextInt();
            }
            
        }
        
        System.out.println("  Matrix Of A : ");
        
        
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    System.out.print(" "+A[row][col]);
                }
                System.out.println(" ");
            
        }
            
              for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++)
            
                    if(row==col){
          diagonal=diagonal+A[row][col] ; 
                  }
           int col = 0;
           
                
                 if(row<col){
                       upper=upper+A[row][col] ; 
                  }
                 
                     if(row>col){
                        lower=lower+A[row][col] ; 
                  }
                
                
                
              }
  
        
        
        System.out.println(" Sum of diagonal "+diagonal);
         System.out.println(" Sum of upper "+upper);
 System.out.println(" Sum of lower "  +lower);

         
        
        
    }
    
    
}
