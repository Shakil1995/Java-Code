
package string;


public class string_input {
    
    public static void main(String[] args) {
        
        String A1="Nurul Amin shakil";
             String A2="Nurul amin  shakil";
        //String A2=new String ("nurul amin shakil");
        
        System.out.println("string A1 : " +A1);
        System.out.println("string A2 : " +A2);
        
        int le=A1.length();
        System.out.println("A1 string length : " +le);
        
         int len=A2.length();
        System.out.println("A1 string length : " +len);
                     
        //if(A1==A2) 
        
       // if(A1.equals(A2)) 
        
       if (A1.equalsIgnoreCase(A2))
       {
            System.out.println("eguel");
        }
        else 
        {
            System.out.println("not equel");
        }
        
        
    }
    
}
