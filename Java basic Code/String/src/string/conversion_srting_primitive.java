
package string;


public class conversion_srting_primitive {
    
    public static void main(String[] args) {
        
        //primitive to string
        
        int a=100;
        String S=Integer.toString(a);
        System.out.println("a = "+S);
        
         double c=10.0;
        String X=Double.toString(c);
        System.out.println("X  = "+X);
        
        
        //string to primitive
        
        String m="10";
        int n=Integer.parseInt(m);
        System.out.println("n =" +n);
        
        
         String e="10";
        double f=Double.parseDouble(e);
        System.out.println("n =" +f);
        
    }
    
}
