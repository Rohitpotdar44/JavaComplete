package Exception_27.Custom_exceptions_4.normal_way;

public class normal_test {
    public static void main(String[] args) throws Exception{
        normal_way_to_throw_exceptions normal_way_to_throw_exceptions1=new normal_way_to_throw_exceptions(57655.80);
        try {
            normal_way_to_throw_exceptions1.withDraw(57655.81);
        } catch (Exception e) {
           System.out.println(e);
        }
        // output -> java.lang.Exception: Insufficient balance
    }
}
