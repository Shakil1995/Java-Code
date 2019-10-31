

package method_use;


public class student {
    
    String name,gender;
    int id,phone,age;
    
    
    void Parametrized_Method(String n,String m,int ag){
    
        name=n;
        gender=m;
        age=ag;
       
        
        
    }
    
    void mehod_desply(){
        
             System.out.println("Name    : "+name);
        System.out.println("Gender  : "+gender);
        System.out.println("Age     : "+age);
        System.out.println("ID      : "+id);
        System.out.println("phone   : "+phone);
        
        
    
        
    }
    
    
}
