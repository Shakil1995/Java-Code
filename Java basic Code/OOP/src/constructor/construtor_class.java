
package constructor;

import java.util.Date;

public class construtor_class {
    
    public static void main(String[] args) {
        
        Constructor con1=new Constructor("Nurul Amin Shakil","Male",23);
        con1.mehod_desply();
        
        System.out.println(" ");
        
           Constructor con2=new Constructor("Mamika Sharmin ","Female",21);
        con2.mehod_desply();
        
        
       
        
        
        Date date=new Date();
        System.out.println(" "+date);
        System.out.println(" \n");
        
        Constructor value=new Constructor();
        
        
        System.out.println(" \n");
        
        
        
    }
    
}
