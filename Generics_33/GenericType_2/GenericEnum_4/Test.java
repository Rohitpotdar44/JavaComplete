package Generics_33.GenericType_2.GenericEnum_4;
// Enums are already type sefe

enum Car{
    WINDSHILD,TYRE,STREEING,ACCELERATOR,BRAKE,CLUTH;
}
public class Test {
    public static void main(String[] args) {
        Car car =Car.WINDSHILD;
        // Car car= "Company"; // it is already type safe so it gives error -> Type mismatch: cannot convert from String to Car
    }
}
