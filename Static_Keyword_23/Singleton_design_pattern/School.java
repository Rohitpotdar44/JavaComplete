package Static_Keyword_23.Singleton_design_pattern;

public class School {
    // Static -> Members , methods , blocks , class
    // we used a private constructor so it can only create only one object and that should be in this Class 

    private static School school=new School();



    // private constructor
    // if we  we want to create only one object of the class 
    private School(){

    }


    // now to access (create instance) in another class -> then we have to do it statically
    
    public static School getInstance(){
        return school;
    }





}
