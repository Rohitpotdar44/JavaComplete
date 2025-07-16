package encapsulation_17;
// class has properties and behaviour -> property_ variables & behaviour-> methods 
public class Vehicle {

    String company;
    private int units;
    int year;

    // setters
    public void setUnits(int units) {
        if (units < 0) {
            units = 0;
        }
        this.units = units; // this -> that particular object's instance
    }

    // getters
    public int getUnits() {
        return this.units;
    }

    // getters setters shortcut in vs code -> source action -> generate setters  & generate getters


    public String getCompany() {
        return company;
    }

    public int getYear() {
        return year;
    }



    public void setCompany(String company) {
        this.company = company;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //
    public static void main(String[] args) {

    }

    
}
