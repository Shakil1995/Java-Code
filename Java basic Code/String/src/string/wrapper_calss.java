
package string;


public class wrapper_calss {
    
    public static void main(String[] args) {
        
        //primetive to object
        
        int a=100;
        Integer b= Integer.valueOf(a);
        System.out.println("value of b : "+b);
        
         Integer c= a;
        System.out.println("value of c : "+c);
        
       //object to primetive 
       
       
       Double d=new Double(10.5);
        System.out.println("D = " +d);
        
        double E =d;
        System.out.println("E = " +E);
        
        
        
        
        
    }
}
