
package Overloading_constructor;


public class Student {
    
    String name,gender;
    int phone;
    
    Student()
            
   {
       System.out.println(" no dhaka "); 
    }
    
    Student(String n,String m){
         name = n;
        gender = m;
       }
    
    
    Student(String n,String m,int p){
     name = n;
         gender = m;
         phone = p;
        
        
    }
    
    void Desplay(){
      
        System.out.println(" Name : "+name);
       
         System.out.println(" Gender : "+gender);
       
          System.out.println(" Name : "+phone);
                  

        
    
    }
    
    
   
    
    
}
