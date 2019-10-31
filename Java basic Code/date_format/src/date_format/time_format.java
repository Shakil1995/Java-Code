
package date_format;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class time_format {
    
    public static void main(String[] args) {
        
    
    
    LocalTime time=LocalTime.now();
    
    DateTimeFormatter formetter=DateTimeFormatter.ofPattern("hh:mm:ss");
    
    String formettertime= time.format(formetter);
    
        System.out.println(" time : "+formettertime);
    
    
    } 
}
