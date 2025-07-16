package Static_Keyword_23;

public  class Student 
{

    private String name;
    private int age;
    private String schoolName;

     public static int count=0;

     // Static Block 
    // used for performing static initialization (one time setup) // if it contains big logic for initialization 
    static{
        System.out.println("Hello");
    }

    
    
    // constructor
     public Student(){
        count++;
    }


    // utils class - frequently used methods(Static) are written in utils class so they are easily accessible using class name only


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


    

    
}
