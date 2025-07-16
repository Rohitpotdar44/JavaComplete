package inner_classes_26.Static_nested_class_2;
// it belongs to outer class rather than it's instance -> we make class static for that purpose
// if Computer's instance is created then it does not effect on the USB class and due to this we can can able to save memory easily
// if we have to write similar things together , and here nested class's obj is not created

public class Computer
 {

    

    private String model;
    private String brand;
    public Computer(String model, String brand,String osName) {
        this.model = model;
        this.brand = brand;
        this.os=new OperatingSystem("Windows");
       
    }
    public OperatingSystem getOs() {
        return os;
    }
    
    private OperatingSystem os;
    class OperatingSystem
    {
        private String osName;
        public OperatingSystem(String osName) {
            this.osName = osName;
        }
       
        public void displayInfo()
        {
            System.out.println("Computer info is : "+ model +" and brand is "+brand + " and os name is : "+osName);
        }
    }


    static class USB {
    
        private String type;

        public USB(String type) {
            this.type = type;
        }
        
        public void displayInfo(){
            System.out.println("USB TYPE IS: "+type);
        }
    }
}
