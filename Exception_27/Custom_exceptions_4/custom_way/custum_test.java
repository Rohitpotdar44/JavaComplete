package Exception_27.Custom_exceptions_4.custom_way;

public class custum_test {

        private  double availableBalance;
                private  double withdrawAmount;
                
                        public custum_test(double availableBalance) {
                                this.availableBalance = availableBalance;
                        }
                
                        public  void withDrawMoney(double withdrawAmount) throws Exception{
                                
                                        if(withdrawAmount>availableBalance){
                                        throw new InsufficientFundsException();
                                }
                                availableBalance -= withdrawAmount;
                                System.out.println(availableBalance);
                
        }


        
}
