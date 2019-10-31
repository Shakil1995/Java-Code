
package Static_Block;


public class Static_block {
    
    
    static int id;
    static String name;
    
    static{
    
    id=20166666;
    name="nurul amin shakil";
    }
    
   static void display(){
    
        System.out.println(" ID NO : "+id);
        System.out.println(" full name : "+name);
        
    
    }
    
    
    
    public static void main(String[] args) {
       
        
        Static_block.display();
        
    }
}
