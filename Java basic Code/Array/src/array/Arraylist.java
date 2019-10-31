
package array;

import java.util.ArrayList;


public class Arraylist {
    public static void main(String[] args) {
        
      ArrayList<Integer>number= new ArrayList<>();
      
        System.out.println("array size : " +number.size());
        
        number.add(20);
        number.add(50);
        number.add(50);
        number.add(90);
        number.add(240);
        number.add(50);
        number.add(2, 10000);
      
              System.out.println("total array " +number );
              
              System.out.println("  ");
              System.out.println("array size : "+number.size());
              
              boolean chack=number.isEmpty();
              System.out.println("arraylis chack : " +chack);
              
              int index=number.indexOf(50);
              System.out.println("index : " +index);
              
              boolean contain = number.contains(24550);
              System.out.println(" arraylist contain : " +contain);
              
             //object  clon=(object) number.clone();
            // System.out.println(" array listy clon : " +clon);
             int get=number.get(2);
               System.out.println("arraylist get ; "+get);
    }
    
}
