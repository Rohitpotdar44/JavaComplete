package Constructors_18;

public class Car {
    String name;
    int airbags;
    String company;
    int cylinders;

 
// public Car(){
//     this.company="BMW";// this is a overloaded constructor , so defalult value of company is set to BMW from null
// }

// parameterised constructor

public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAirbags() {
        return airbags;
    }


    public void setAirbags(int airbags) {
        this.airbags = airbags;
    }


    public String getCompany() {
        return company;
    }


    public void setCompany(String company) {
        this.company = company;
    }


    public int getCylinders() {
        return cylinders;
    }


    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }


public Car(String name, int airbags, String company,int cylinders){
    this.name=name;
    this.airbags=airbags;
    this.company=company;
    this.cylinders=cylinders;

}// as soon as we create parameterised constructor java doesn't considers default constructor


//Method overloading -> method name will be same but parameters are differ in numbers , data type etc.
public Car(String name){
    this.name=name;
}







}