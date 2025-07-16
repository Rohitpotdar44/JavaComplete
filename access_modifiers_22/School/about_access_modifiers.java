package access_modifiers_22.School;

public class about_access_modifiers {
    public static void main(String[] args) {
        // they are keywords that decides visibility of class , methods , and other mwmbers

        // public- accessible anywhere e.g consider two files student.java and test.java -> so all public attributes or methods in student.java are accessible in test.java by obj of test.java. that attribute or method
        // private - accessible within that class only (class level only)
        // default - no keyword
        // protectes - accessible to the only class that extenends the main(parent)class-> another class which is not extending the main class is not able to access that method-> but it it is in same package it it will be accessible

        // private constructor-> then other cannot create object of that class
        // static methods-> normal methods are attached to the object -> static methods are attached to the class
        // e.g.  public statc void sayBye(){sysout("bye"); } -> accessed as classname.sayBye();->when we have to no need to create object

        School.getInstance();

// Access Modifiers Table
// Context\Access Modifier   | private | default (no modifier) | protected | public
// -------------------------------------------------------------------------------
// Same Class                |   Yes   |         Yes           |    Yes    |  Yes
// Same Package              |   No    |         Yes           |    Yes    |  Yes
// Subclass (same package)   |   No    |         Yes           |    Yes    |  Yes
// Subclass (different pkg)  |   No    |         No            |    Yes    |  Yes
// Different Pkg (non-subcls)|   No    |         No            |     No    |  Yes


        


















    }
}
