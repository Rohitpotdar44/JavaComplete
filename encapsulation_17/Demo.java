package encapsulation_17;

public class Demo {
    public static void main(String[] args) {
   
        Vehicle vehicle=new Vehicle();// Vehicle() is a constructor
        vehicle.company="Toyota";
        System.out.println(vehicle.company);
        vehicle.setUnits(987);
        System.out.println(vehicle.getUnits());
        vehicle.setCompany("Dodge");
        vehicle.setYear(1969);
        System.out.println(vehicle.getCompany());
        System.out.println(vehicle.getYear());
    }
}
