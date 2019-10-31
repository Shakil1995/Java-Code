
package string;


public class string_palindrom {
    
    
    public static void main(String[] args) {
       // String N="ama";
        String N=("nurul amin shakil");
       // StringBuffer s1= new StringBuffer ("nurul amin shakil");
         StringBuffer s1= new StringBuffer (N);
        
        System.out.println(s1);
        
      String s2=s1.reverse().toString();
       //System.out.println(s2);
       
       if (N.equals(s2)){
            System.out.println("palimdrom");
       }
            else {
            System.out.println("not palimdrom");
       }
        
    }
    
}
