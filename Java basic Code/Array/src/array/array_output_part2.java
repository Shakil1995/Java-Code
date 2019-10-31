
package array;


public class array_output_part2 {
    public static void main(String[] args) {
        
        int [][] A=new int[10][];
       int i=0;
        A[0]= new int[1];
            A[1]= new int[2];
              A[2]= new int[3];
                 A[3]= new int[4];
                 A[4]= new int[5];
            A[5]= new int[6];
              A[6]= new int[7];
                 A[7]= new int[8];
                  A[8]= new int[9];
                   A[9]= new int[10];
                 
                 
                 
                 for (int row = 0; row <10; row++) {
                     for (int col = 0; col <row+1; col++) {
                         A[row][col]=i;
                         i++;
                         
                     }
        }
                 
                 for (int row = 0; row < 10; row++) {
                     for (int col = 0; col < row+1; col++) {
                         System.out.print(A[row][col]+" " );
                         
                     }
                     System.out.println(" ");
        }
                 
       }
    
}
              
                 
                 
        
        
