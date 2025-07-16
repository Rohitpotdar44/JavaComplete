package Collections_Framework_and_Streams_Masterclass_35.Map_6;
import java.util.Map;
import java.util.WeakHashMap;
public class WeakHashMap_6 {

    // don't use weakhashmap for the imp work beacuse entries way vanished here , but can be used as cache , bcaz even if cache is vanished then we can retrive it through source


    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        loadCache(imageCache); // loadCache is a method and we are passing weakhashmap (imageCache) into it 
        System.out.println(imageCache); // print map
        System.gc(); // suggesting jvm
        simulateApplicationRunning(); // method calling
        System.out.println("Cache after running (some entries may be cleared): " + imageCache); // again printing map to see whether it is vanished or not
    }
     public static void loadCache(Map<String, Image> imageCache) {
        //2) strings are stored in string pull(in literals form) and they are treated as strong reference so jvm don't ignore it
        // here we are creating string reference but it's scope is limited to this method only   // so jvm clears it after 5 sec
        String k1 = new String("img1");
        String k2 = new String("img2");
        //1) we write that method in main but we can't  put data yet so it is done here
        imageCache.put(k1, new Image("Image 1"));
        imageCache.put(k2, new Image("Image 2"));
    }

    // o/p

    /*
     {img1=Image 1, img2=Image 2}
Simulating application running...
Cache after running (some entries may be cleared): {}
     */


    private static void simulateApplicationRunning() {
        try {
            System.out.println("Simulating application running...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Image {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

