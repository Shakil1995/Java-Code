
package array;


public class array_outpit {
    public static void main(String[] args) {
        
        int [][] A=new int[4][5];
        int i=0;
        
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                A[row][col]=i;
                i++;
               System.out.print(" " +i);
            }
            System.out.println(" ");
            
        }
    
        System.out.println(" ");
        
    }
    
}
