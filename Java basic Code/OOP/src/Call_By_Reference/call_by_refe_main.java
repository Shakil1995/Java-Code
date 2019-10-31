
package Call_By_Reference;

public class call_by_refe_main {
    public static void main(String[] args) {
        
  call_by_reference ob=new call_by_reference();
  
ob.name="nurul";
        System.out.println(" change : " +ob.name);
        
        
        ob.value(ob);
        System.out.println(" after the chnge : "+ob.name);
        
    }
    
}
