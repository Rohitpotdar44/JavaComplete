package Polymorphism_20;

public class compile_time_polymorphism {
    // poly-> means many and morphs-> means forms
    // two types -> compile time and run time

    // compile time -> decision will be made at compile time that which method should called -> also called as method over loading
    // in compile time it acts differently based on the object but method's signature will be same
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b, int c){
        return a+b+c;
    }
    public double add(double a , double b){
        return a+b;
    }
    public static void main(String[] args) {
        compile_time_polymorphism compile_time=new compile_time_polymorphism();
        System.out.println(compile_time.add(23, 23));
        System.out.println(compile_time.add(23, 23, 23));
        System.out.println(compile_time.add(23.23, 23.23));
    }




}



