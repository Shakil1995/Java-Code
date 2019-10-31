
package bit_wase_oparetion;

import java.util.Scanner;


public class decimal_to_other {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("enter the value :");
        int decimal = input.nextInt();
        
        
        String Binaray=Integer.toBinaryString(decimal);
        System.out.println("binaray : " +Binaray);
        
        String octal=Integer.toOctalString(decimal);
        System.out.println("Octal : "+octal);
        
           String hex=Integer.toHexString(decimal);
        System.out.println("Hexadecimal : "+hex);
        
        
        /*String binaray="101010";
        Integer dec=Integer.parseInt(binaray,2);
        System.out.println(" decimal : "+dec);
        
       */
    }
    
}
