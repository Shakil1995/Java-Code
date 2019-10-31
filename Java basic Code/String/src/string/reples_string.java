
package string;

public class reples_string {
    public static void main(String[] args) {
        
        String S ="my name is nurul amin shakil";
        
        
        
        System.out.println(" full string : " +S);
        
        
        String s2=S.replace('n', 'X');
        System.out.println(" after replce string : "+s2);
        
        System.out.println(" after the split srtng : ");
       String[] X=S.split(" ");
       for(String split:X)
       {
           System.out.println(split);
       }
        
        
    }
    
}
