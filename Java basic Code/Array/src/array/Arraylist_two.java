
package array;

import java.util.ArrayList;

public class Arraylist_two {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> number1 = new ArrayList<>();
           ArrayList<Integer> number2 = new ArrayList<>();
          ArrayList<Integer> number3 = new ArrayList<>();
          

        
        number1.add(20);
        number1.add(40);
        number1.add(80);
        number1.add(10);
        number1.add(240);
        number1.add(50);
        System.out.println("first arraylist : "+number1);
        
        System.out.println("\n");
        
        
         number2.add(20);
        number2.add(50);
        number2.add(50);
        number2.add(90);
        number2.add(240);
        number2.add(50);
         System.out.println("2nd arraylist : "+number2);
          System.out.println("\n");
        
         
         number3.addAll(number2);
        System.out.println("after adding array : "+number3);     
         System.out.println("\n");
        
        
        boolean a =number3.equals(number1);
        System.out.println("number2 or number3 equeal ? :  "  +a);
         System.out.println("\n");
        
        
        
        
    }
}
