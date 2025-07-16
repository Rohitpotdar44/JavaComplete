package access_modifiers_22.School;

// read about_access_modifiers first
// if we want to create only one object not more than one
public class School {
    private static School instance; // instance maybe any word e.g. we can write school also there

    private School() {
        // private constructor
    }
    // so we have to write public method here

    public static School getInstance() {
        if (instance == null) {
            instance = new School();
        }
        return instance;// only on first time true then later false called as singalton pattern
    }


    // Default->

    // class has only two access modifiers -> public & default-> no access modifiers -> not access from another package


}
