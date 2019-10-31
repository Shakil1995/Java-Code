
package problem_solving;


public class boxes {
    
    double height;
    double wigth;
    double depth;
    
    
   boxes(double h,double w,double d){
   
   height =h;
   wigth=w;
   depth=d;
   }
   
   
   void DisplyVOL()
   {
      double X= (height*wigth*depth);
       
       System.out.println(" "+X);
   
   }
    
}
