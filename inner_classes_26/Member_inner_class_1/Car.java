package inner_classes_26.Member_inner_class_1;
// inner class behave as member of outer class
// car has something it's properties and every car has it's seperate engine so to define it's properties futher we create engine member inner class inside car class itself
public class Car 
{
    // Member inner class
    private String model;
    private boolean isEngineon;

    public Car(String model){
        this.model = model;
        this.isEngineon=false;
    }

    
    // inner classs

    
      public  class Engine {
    
       public void start(){
            if(!isEngineon){
                isEngineon=true;
                System.out.println(model+" Engine Started");
            }
            else{
                System.out.println(model+" Engine is already on");
            }   
        }

       public void stop(){
            if(isEngineon){
                isEngineon=false;
                System.out.println(model+" Engine stopped");
            }
            else{
                System.out.println(model+" Engine is already off");
            }   
        }
        
    }



}
