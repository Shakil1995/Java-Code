
package variable_length_arguments;


public class v_l_arguments {
    
    
    void add(int ...num)
   {
      int  sum=0;
       for (int x:num) {
           sum=sum+x;
           
       }
       System.out.println(" add value : "+sum);
   
       
   
   
   }
    
    
    
}
