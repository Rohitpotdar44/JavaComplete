package Generics_33.TypeErasure_4;
// basically it shows internal working of the generics at the time of compilation - at time of compilation after type checking the type get erased and we get picture like follows
public class Main {
    
public static void main(String[] args) {

    // Before

// Box<String> stringBox = new Box<>();
// stringBox.setValue("Hello");
// String value = stringBox.getValue();

    //After

// Box stringBox = new Box();
// stringBox.setValue("Hello");
// String value = (String) stringBox.getValue();
}
}
 
