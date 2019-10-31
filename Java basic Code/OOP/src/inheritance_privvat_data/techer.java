
package inheritance_privvat_data;


public class techer extends person {

   
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    
    void desplay2(){

          System.out.println("name : "+getName());
             System.out.println(" gender  : "+getGander());
    System.out.println(" age  : "+getAge());
    System.out.println(" moble no : "+getMoble());
        System.out.println(" gulaificatiopn : "+getQualification());
    
    
    }
      
       
}
