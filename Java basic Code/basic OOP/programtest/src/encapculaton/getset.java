
package encapculaton;

public class getset {
    
    
    private String name;
    private  String gender;
    private int age;
    private double cgpa;
    private String uv;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getUv() {
        return uv;
    }

    public void setUv(String uv) {
        this.uv = uv;
    }
    
    
   
    public static void main(String[] args) {
        
        getset ob =new getset();
        ob.name="shakil";
        ob.gender="male";
        ob.age=23;
        ob.cgpa=2.9;
        ob.uv="Southeast University";
        
        System.out.println(" name : "+ob.getName());
        System.out.println(" Gender : "+ob.getGender());
        System.out.println(" my age  : "+ob.getAge());
        System.out.println(" my cgpa : "+ob.getCgpa());
        System.out.println(" university name :  : "+ob.getUv());
        
        
    }
    
}
