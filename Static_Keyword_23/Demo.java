package Static_Keyword_23;
//Static keyword is used for memory management primarily->applied to variables , methods , blocks and nested classes
// Static methods not need to create objects they are using class itself(to use/call them) , non static methods requires to create an object to use them   
// whatever on which we apply static then it becomes a part of class not of instance
// this and super  cannot used in static context 
public class Demo {
    public static void main(String[] args) 
    {
        Student student=new Student();
        Student student2=new Student();
        Student student3=new Student();
        Student student4=new Student();
        Student student5=new Student();
        Student student6=new Student();
        System.out.println(Student.count);




        // So here we are accessing count with the help of class not instance(objects) 
        // if we use instance then each time new memory alloted and it leads to the wastage of memory 
        // so using static keyword we are saving the memory
        // so in every main method static -> jvm diectly calles it without creating any object
    }
}
