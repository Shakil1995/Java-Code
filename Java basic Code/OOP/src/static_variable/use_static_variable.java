
package static_variable;


public class use_static_variable {
    
    
    String name,nike_name;
    int id;
   static String uv="Southeast University";
    
    
    use_static_variable( String n,String nike){
    name=n;
    nike_name=nike;
    
    }
    
    
     
    use_static_variable( String n,String nike,int i){
    name=n;
    nike_name=nike;
    id=i;
    
    }
    
    
    void display(){
    
        System.out.println(" name : "+name);
        System.out.println(" Student nike name  : "+nike_name);
        System.out.println(" Student ID : : "+id);
        System.out.println(" University :  : "+uv);
        
        
    }
    
    
    
    
    
    
   
    
}
