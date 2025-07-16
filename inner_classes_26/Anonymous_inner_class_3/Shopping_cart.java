package inner_classes_26.Anonymous_inner_class_3;

public class Shopping_cart 
{
    private double amount;

    public Shopping_cart(double amount) {
        this.amount = amount;
    }

    public void processPayment(Payment paymentMethod )// here we used the instance of the interface
    {
        paymentMethod.pay(amount);
    }
    
    //  now to avoid the step of the crating seperate implementing class 
   // see demo.java



}
