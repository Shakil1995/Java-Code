
package unary_operator;


public class Unary_operator {

   
    public static void main(String[] args)
    
    {
        int x=14;
        int y;
        
        x=+x;
        System.out.println(" unary plus : " +x);
        
          x=-x;
        System.out.println(" unary mainus : " +x);
       
          y=x++;
        System.out.println(" postfix increment unary  : " +y);
          y=x;
        System.out.println(" postfix increment unary: " +y);
       
        
         y=++x;
        System.out.println(" prefix increment unary: : " +y);
          y=x;
        System.out.println(" prefix increment unary: : " +y);
       
           y=x--;
        System.out.println(" postfix decrement unary : " +y);
          y=x;
        System.out.println(" postfix decrement unary: " +y);
        
             y=--x;
        System.out.println(" pprefix decrement unary : " +y);
          y=x;
        System.out.println(" prefix decrement unary : " +y);
       
    }
    
}
