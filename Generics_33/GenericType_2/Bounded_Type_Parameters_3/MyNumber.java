package Generics_33.GenericType_2.Bounded_Type_Parameters_3;
// Bounding means applying some rules such as particular class should extends one class or one interface like wise
public class MyNumber<N extends Number> // here  Number is the Class which N extends , int also extends Number (this is the rule applied here that is N should be a number)
 {
   private N value;
   public N getvalue(){
    return value;
   }
   public void setvalue(N value){
    this.value=value;
   }

}
