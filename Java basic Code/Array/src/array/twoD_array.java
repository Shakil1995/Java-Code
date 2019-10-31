
package array;


public class twoD_array {
    public static void main(String[] args) {
        
        int[][] number =new int[2][3];
        
        number[0][0]=20;
        number[0][1]=50;
        number[0][2]=70;
        number[1][0]=10;
        number[1][1]=80;
        number[1][2]=100;
        
        for (int row = 0; row <2; row++) {
            
            for (int col = 0; col <3; col++) {
                
                System.out.print(" " +number[row][col]);
            }
            
            System.out.println(" ");
            
        }
        System.out.println(" ");
        
        
    }
    
}
