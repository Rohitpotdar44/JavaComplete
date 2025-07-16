package multithreading_31.accessing_thread_1.second_way;

public class main {
    public static void main(String[] args) {
        world world1=new world();
        Thread t1=new Thread(world1);
        t1.start();


    for( ; ;){
        System.out.println("Hello");
    }
    }
}
