package inner_classes_26.Member_inner_class_1;

public class Demo {
// there are 4 types of inner classes 
//    1.Member inner class
//    2.Static nested class
//    3.local inner class
//    4.Anonymous inner class 

    public static void main(String[] args) 
    {
       Car car=new Car("Harrier");
       Car.Engine engine= car.new Engine();
       engine.start();
       engine.stop();
    }



}
