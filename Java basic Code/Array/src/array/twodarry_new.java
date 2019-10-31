
package array;


public class twodarry_new {
    public static void main(String[] args) {
        
        
        int [][] num = new int[3][4];
        
        num[0][0]=5;
        num[0][1]=8;
        num[0][2]=9;
        num[0][3]=10;
        num[1][0]=2;
        num[1][1]=6;
        num[1][2]=12;
        num[1][3]=15;
        num[2][0]=16;
        num[2][1]=2;
        num[2][2]=20;
        num[2][3]=11;
        
        

        
        
        System.out.println(" total length in this array : "+num.length);
        
        for (int row = 0; row < 3; row++) {
            
            for (int col = 0; col < 4; col++) {
                
                System.out.print(" "+num[row][col]) ;
                
          
                
            }
            System.out.println(" ");
            
        }
        

        System.out.println(" ");
    }
    
}
