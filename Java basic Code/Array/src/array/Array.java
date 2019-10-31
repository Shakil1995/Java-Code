
package array;


public class Array {

    public static void main(String[] args) {
        
       
        int[] num=new int[50];
        
        num[1]=10;
        num[2]=10;
        num[3]=10;
        num[4]=10;
        num[5]=100;
        num[6]=10;
        num[7]=10;
        num[8]=1000;
        num[9]=10;
        
        
        int sum=num[1]+num[2]+num[3]+num[4]+num[5]+num[6]+num[7]+num[8]+num[9];
        System.out.println("total sum : " +sum);
        
        int len=num.length;
        System.out.println("total array lenght : " +len);
        
        
        
        
        
        
    }
    
}
