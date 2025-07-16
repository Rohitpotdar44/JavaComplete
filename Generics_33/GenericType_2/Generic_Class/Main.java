package Generics_33.GenericType_2.Generic_Class;



public class Main {
    public static void main(String[] args) {
        Pair<Integer,Integer> demo=new Pair<>(2, 3);
        System.out.println(demo.getkey());
        System.out.println(demo.getvalue());
    }
}
