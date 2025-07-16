package Exception_27.Custom_exceptions_4.custom_way;

public class test {
    public static void main(String[] args)  {
        custum_test custum_test2=new custum_test(454.45);
      try {
        custum_test2.withDrawMoney(455);
      } catch (Exception e) {
        System.out.println(e);
      }

        // output-> Exception_27.Custom_exceptions_4.custom_way.InsufficientFundsException: What do you want ? you don't have money
       
    }
   
}
