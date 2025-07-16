package Interfaces_25.how_to_achieve_multiple_inheritance;

public class Test {
    public static void main(String[] args) {
         Smartphone smartphone=new Smartphone();
        
         smartphone.powerOn();
          smartphone.clickPhoto();
          smartphone.makeCall();
          smartphone.endCall();
        
          // we can write main method in interfaces also ( main method is also a static method)
    }
}
