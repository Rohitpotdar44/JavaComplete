package Generics_33.GenericType_2.Bounded_Type_Parameters_3;

// now we are doing this to apply multiple boundations such as class extends another class and also implements an interface
interface Hatchback
{
    void length();
}
class Sedan {
    public void bootSpace(){
        System.out.println("Enough Bootspace");
    }

}
 class Company extends Sedan implements Hatchback {

    private int price;

    public Company(int price) {
        this.price = price;
    }

     public int getPrice() {
        return price;
    }

    @Override
    public void length() {
        System.out.println("Company will decide features in Hactchback");
    }

    @Override
    public void bootSpace() {
        System.out.println("Generally 500ltrs");
    }


    
}

// here we applied boundation
     class Vehicles<V extends Sedan & Hatchback >  {
        
        private V units;

        public V getUnits() {
            return units;
        }

        public void setUnits(V units) {
            this.units = units;
        }

      public  void displayDetails(){
                units.bootSpace();
                units.length();
                
        }

    }
    

public class Test {
        public static void main(String[] args) {
            Company company=new Company(600000);
            Vehicles<Company> vehicles=new Vehicles<>();
            vehicles.setUnits(company);
            vehicles.displayDetails();
                        
        }    
}
