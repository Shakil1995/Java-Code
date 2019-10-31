
package string;


public class strin_upar_lower {
    
    public static void main(String[] args) {
        
        String firstName="nurul";
          String secendName=" amin";
            String thredName=" shakil";
           char i;
            
            System.out.println("1st name string : " +firstName);
            System.out.println("2nd name string : " +secendName);
            System.out.println("3rd name string : " +thredName);
            
    // String fulname=(firstName+secendName+thredName);
      //  System.out.println(" fulname : " +fulname);
      
      String fulname=firstName+secendName+thredName;
            System.out.println(" ");
            System.out.println(" dfulname :  " +fulname);
            
            System.out.println("full string length : "+fulname.length());
            
            
            String upar=fulname.toUpperCase();
            System.out.println(" uppercase full String : "+upar);
            
            String lower=fulname.toLowerCase();
            System.out.println(" lowarcase full string : "+lower);
            
            boolean start=fulname.startsWith("n");
            System.out.println(" start with : "+start);
            
            boolean end =fulname.endsWith("i");
            System.out.println("endwith :"+end );
            
            String[] name ={"nurul" ," amin" ," shakil"};
            
            
            System.out.println(" full name : ");
            for(String funame : name)
            {
               
            
              System.out.print(funame);
                
            }
            
            System.out.println(" ");
            
            int codepoint=fulname.codePointAt(0);
            System.out.println(" code of pontat : " +codepoint);//asci valu print
            
            
            int lest = fulname.lastIndexOf('a');
            System.out.println(" lestindexOF : " +lest);
            
            int ch=fulname.charAt(0);
            System.out.println("chart : " +ch);
            
            
            System.out.println(" ");
            
        }
        
    }
    

