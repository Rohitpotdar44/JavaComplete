package Enums_30.using_enums;

public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    // relation is sunday is a->  day , tuesday is a -> day as like 

    // in enums sun,mon,tue are the final instances of the Day

    // In compille time Day(Enum) becomes Day(Final class)which is not extending -> because we are already giving fix set of constants 



    // Enums internal working is as follows:


//     public final class Day extends java.lang.Enum<Day> {
//     public static final Day SUNDAY = new Day("SUNDAY", 0);
//     public static final Day MONDAY = new Day("MONDAY", 1);
//     public static final Day TUESDAY = new Day("TUESDAY", 2);
//     public static final Day WEDNESDAY = new Day("WEDNESDAY", 3);
//     public static final Day THURSDAY = new Day("THURSDAY", 4);
//     public static final Day FRIDAY = new Day("FRIDAY", 5);
//     public static final Day SATURDAY = new Day("SATURDAY", 6);

//     private static final Day[] VALUES = { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY };

//     private Day(String name, int ordinal) {
//         super(name, ordinal);
//     }

//     public static Day[] values() {
//         return VALUES.clone();
//     }

//     public static Day valueOf(String name) {
//         for (Day day : VALUES) {
//             if (day.name().equals(name)) {
//                 return day;
//             }
//         }
//         throw new IllegalArgumentException("No enum constant " + name);
//     }
// }



  //AS enum becomes becomes class so we can create it's obj and methods also


    public void dispaly(){
        System.out.println("Today is : "+this.name());// this name is from enum internal method public final String name() { return name; }
    }


    // this is how to do stuff related to the Fields


    // SUNDAY("saturday"), MONDAY("monday"), TUESDAY("tuesday"), WEDNESDAY("wednesday"), THURSDAY("thrusday"), FRIDAY("friday"), SATURDAY("saturday");
    // above is happend due to custom constructor
    // private String lower;

    // public String getLower(){
    //     return lower;
    // }


    // private Day(String lower) {
    //     System.out.println("Our Constructor");
    //     this.lower = lower;
    // }

    // now in Demo id we   System.out.println(monday.getLower()); // o/p monday
    

 
}
