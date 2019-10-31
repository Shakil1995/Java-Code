
package date_format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;




public class Date_format {

   
    public static void main(String[] args) {
        
        Date date=new Date();
        //System.out.println("date : "+date);
        
        DateFormat dateFormat=new SimpleDateFormat("dd/MM/YYYY");
        String curentdate=dateFormat.format(date);
        
        System.out.println(" now curent date : "+curentdate);
        
    }
    
}
