
package string;


public class string_Buffer {
    
    public static void main(String[] args) {
        
        StringBuffer SB =new StringBuffer("nuurl");
        System.out.println(SB);
        
        SB.append(" amin");
        System.out.println(SB);
        
        SB.append(" age 24");
        System.out.println(SB);
        
        //SB.reverse();
        //System.out.println(SB);
        
        SB.delete(7, 12);
        System.out.println(SB);
        
        SB.setLength(5);
            System.out.println(SB);
        
    }
    
    
}
