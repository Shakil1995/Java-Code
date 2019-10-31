
package Call_by_value;

public class call_vai_value_main {
    public static void main(String[] args) {
        
        call_by_valuw ob =new call_by_valuw();
        
        int a=10;
        System.out.println(" call by value : "+a);
        
        
        ob.chnage(a);
        System.out.println(" after call by value : "+a);
        
        
    }
}
