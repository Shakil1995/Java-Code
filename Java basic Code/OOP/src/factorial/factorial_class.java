
package factorial;


public class factorial_class {
    
   int fact (int n){
       if(n==1)
           return 1;
       else 
           return n*fact(n-1);
   
   }
    
}
