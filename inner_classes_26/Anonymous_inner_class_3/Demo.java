package inner_classes_26.Anonymous_inner_class_3;
// it is used when we have to implement the interface without creating it's implementation class or we have to extend any class without creating it's subclass then we can make a use of Anonymous inner class
// is is said to be anonymous because we creating that class and at the same time we are using it without any name
// for one time use if we want to create any implementation class and want to create it's obj then we use ano inn class 
public class Demo 
{
    public static void main(String[] args) {
        Shopping_cart shopping_cart=new Shopping_cart(678.9);
        shopping_cart.processPayment(new Payment() {

            @Override
            public void pay(double amount) {
                System.out.println(amount+" , this is the amount paid using Credit card ");
                
            }
            
        });


        shopping_cart.processPayment(new Payment() {

            @Override
            public void pay(double amount) {
                System.out.println(amount+" , this is the amount paid using Pay Pal");
                
            }
            
        });
    }
    
}
