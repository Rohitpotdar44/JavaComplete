package Inheritance_19.multilevel_inheritance;

public class Test {
    public static void main(String[] args) {
        Smartphone smartphone=new Smartphone();
        smartphone.clickPhoto();
        smartphone.powerOn();// there are three same methods -> it gives error ihat is multiple inheritance
    }
}
