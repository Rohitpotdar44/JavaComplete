package inner_classes_26.Static_nested_class_2;

public class test {
    public static void main(String[] args) {
       Computer computer=new Computer("OMEN 16", "HP", "WINDOWS");
       computer.getOs().displayInfo();
       
       Computer.USB usb=new Computer.USB("C type");// here we used direct outer class i.e Computer not it's instance i.e computer
       usb.displayInfo();
       // so computer's instance and this are created in differently -> and grouped in one place so it saves the memory
       
    }
}
