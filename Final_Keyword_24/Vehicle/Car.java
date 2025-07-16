package Final_Keyword_24.Vehicle;

public class Car extends Vehicle
{

    private final int speedLimit=200;
    // also used as private static final int speedLimit=200;

    // also we can do  initialisation part in static block and constructor
    // static{
    //          speedLimit=200;
    //       }
    // Public Car(){
        // speedLimit=200;
        //             }

// if we also apply final to class also then another class cannot extends it

// we cannot apply final on constructor because overriding is not happened in constructor

    @Override
    public void accelerate(){
      
    }  
    @Override
    public void decelerate(){

    }  

    public void airbags(){
        System.out.println("2");
    }
    // it cannot override final method

}
