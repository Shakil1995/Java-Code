
package Overloading_constructor;


public class Sudent_class {
    public static void main(String[] args) {
        
        
        
        Student st1=new Student( );
        //st1.Desplay();
        System.out.println(" ");
        
        
        Student st2=new Student("shakil","male");
        st2.Desplay();
        
        System.out.println(" ");
        
         Student st3=new Student("riya","female",16258);
        st3.Desplay();
        System.out.println(" ");
        
    }
    
}
