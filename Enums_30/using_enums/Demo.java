package Enums_30.using_enums;

public class Demo {

    //4)
     // Enum also declared inside the class
     public enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER;
    }
    public static void main(String[] args) {
      //1)  
      
      System.out.println(Day.MONDAY);
        System.out.println(Day.FRIDAY);

        //AS enum becomes  class so we can create it's obj and methods also
        //2)
         Day monday= Day.MONDAY;
         System.out.println("Today is :"+monday);
          int ordinal=monday.ordinal();
          System.out.println(ordinal); // it prints monday's index which is 1


          monday.dispaly();
          //3)
        Day day=Day.MONDAY;

          // also used in switch
          switch (day) {
            case MONDAY:{
System.out.println("Today is monday");
                break;
            }
          
            default:{
                System.out.println("Other than Monday");
            }
                
          }

          // WE CAN ALSO USE ENUMS INSIDE CLASS

         

           //4)
        
            
                for (Month month : Month.values()) {
                    System.out.println(month);
                }
        
                // Example: Using an enum value
                Month currentMonth = Month.JANUARY;
                System.out.println("The current month is: " + currentMonth);
            
        
        
    }
}
