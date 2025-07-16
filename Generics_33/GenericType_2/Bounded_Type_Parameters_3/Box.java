package Generics_33.GenericType_2.Bounded_Type_Parameters_3;

public class Box {
    public static void main(String[] args) {
        // myNumber<String> myNumber=new myNumber<>();
        // this shows errror because it takes String not Integer

        MyNumber<Integer> mynumber=new MyNumber<>();
    }
}
