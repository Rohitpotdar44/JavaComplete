package inner_classes_26.local_inner_class_4;

// if we have to write class inside method and also it is not accessible outside then we use inner_class (specifically in small tasks)

public class Hotel {

    private String hotelName;
    private int totalRooms;
    private int reservedRooms;

    public Hotel(String hotelName, int totalRooms, int reservedRooms) {
        this.hotelName = hotelName;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void reservingRooms(String guestName, int noOfRoomsRequried)
    {
        class ReservationValidater
        {
            boolean validate(){
                if(guestName==null || guestName.isBlank()){
                    System.out.println("Guest name should not be empty");
                    return false;
                }
                if(noOfRoomsRequried<0){
                    System.out.println("No of rooms should be positive");
                    return false;
                }
                if(reservedRooms+noOfRoomsRequried>totalRooms){
                    System.out.println("Rooms are not available");
                    return false;
                }
              
            
            return true;
        }
        }

        ReservationValidater reservationValidater=new ReservationValidater();
        if(reservationValidater.validate())// by doing this we can easily access the outer class fields such as reservedRooms and totalRooms
        {
            reservedRooms+=totalRooms;
            System.out.println("Reservation confirmed for "+guestName+" for "+noOfRoomsRequried+" rooms");
        }
        else{
            System.out.println("Registration failed");
        }
    

    }


    
}
