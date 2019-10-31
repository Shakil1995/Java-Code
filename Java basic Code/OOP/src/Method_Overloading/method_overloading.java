
package Method_Overloading;


public class method_overloading {
    
    void value(int a,int b){
        System.out.println("add vallue int 2 value : "+a+b);
    }
    
    
    void value(int a,int b,int c){
        System.out.println("add vallue interger 3 value : "+a+b+c);
    }
    
    
    void value(double a,double b){
        double x=a+b;
        System.out.println("add vallue double : "+x);
    }
    
    void value(){
        System.out.println("no valu in this function");
    }
    
    
}
