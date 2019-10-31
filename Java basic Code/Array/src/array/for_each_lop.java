
package array;


public class for_each_lop {
    public static void main(String[] args) {
        int[] num={10,20,30,40,60,70,80,100};
        int sum=0;
        int avg=0;
        
        for(int x : num){
            sum=sum+x;
           avg=sum/num.length;
            
        System.out.println("" +x);
            
        
        }
        
        System.out.println("total array length : " +num.length);
        
          System.out.println("total sum  : " +sum);
   
          
             System.out.println("total avarege  : " +avg);
             
    }
    
}
