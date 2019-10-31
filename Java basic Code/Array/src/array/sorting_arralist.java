
package array;

import java.util.ArrayList;
import java.util.Collections;


public class sorting_arralist {
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new  ArrayList<Integer>();
        
        
         number.add(20);
        number.add(20);
        number.add(-10);
        number.add(-90);
        number.add(24);
        number.add(60);
        
        System.out.println("ArrayList : " +number);
        
       Collections.sort(number);
        System.out.println("arraylist pint acending : "+number);
        
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("arraylist decending oader : " +number);
        
        
    }
    
}
