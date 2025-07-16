package inner_classes_26.local_inner_class_4;

public class test {
    public static void main(String[] args) {
        Hotel hotel=new Hotel("Hotel TIP TOP", 100, 25);
        hotel.reservingRooms("Rohit Potdar", 25);
        hotel.reservingRooms("", 10);
        hotel.reservingRooms("Shyam", -8);
        hotel.reservingRooms("Jay Shyah", 51);
    }
}
