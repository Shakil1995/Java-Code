
package array;

import java.util.Scanner;


public class two_matrix_sum {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        
       int[][] A =new int[2][3];
       int [][] B=new int [2][3];
         int [][] C=new int [2][3];
       
        System.out.println("enter the matrix A value : ");
         for (int row = 0; row < 2; row++) {
                for (int col = 0; col < 3; col++) {
                    System.out.printf("A[%d][%d] = ",row,col);
               
                  A[row][col] = input.nextInt();     
                                }
      }
         
             System.out.println("enter the matrix B value : ");
         for (int row = 0; row < 2; row++) {
                for (int col = 0; col < 3; col++) {
               
                     System.out.printf("B[%d][%d] = ",row,col);
                  B[row][col] = input.nextInt();     
                                }
      }
         
         System.out.println("\n");
               
             System.out.println("matrix A : ");
         for (int row = 0; row < 2; row++) {
             for (int col = 0; col < 3; col++) {
                 
                 System.out.print( "       " +A[row][col]);
                 
             }
             System.out.println("  "); 
            
        }
         System.out.println(" ");
            
      
            
        
            
             System.out.println("matrix B : ");
         for (int row = 0; row < 2; row++) {
             for (int col = 0; col < 3; col++) {
                 
                 System.out.print( "       " +B[row][col]);
                 
             }
             System.out.println("  "); 
            
        }
         System.out.println(" ");
            
         
         System.out.println("A+B : ");
         
         for (int row = 0; row < 2; row++) {
             System.out.println(" ");
             for (int col = 0; col < 3; col++) {
                 
                 C[row][col]=(A[row][col]+B[row][col]);
                 
                 System.out.print(" "+C[row][col]);
             }
            
        }
         System.out.println(" ");
         
         
      
        
    }
    
}
