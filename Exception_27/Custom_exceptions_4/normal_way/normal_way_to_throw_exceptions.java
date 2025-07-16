package Exception_27.Custom_exceptions_4.normal_way;

public class normal_way_to_throw_exceptions {
    private double amount;
    private double balance;
    public normal_way_to_throw_exceptions(double balance){
        this.balance=balance;
    }
    public void withDraw(double amount) throws Exception{
        if(amount>balance){
            throw new Exception("Insufficient balance");// this is custom
        }
        balance -=amount;
        System.out.println(balance);
    }
}

