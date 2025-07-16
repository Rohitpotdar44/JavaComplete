package Generics_33.GenericType_2.GenericInterfaace;

// 1st way->> to generic the interface while implementing

// public class Main implements Container <String>{
//     private String item;
//     @Override
//     public void add(String item) {
//         this.item=item;
//     }

//     @Override
//     public String get() {
//         return null;
//     }

   
    
// }


// 2nd way to make the class generic
public class Main<T> implements Container <T>{
    @Override
    public void add(T item) {
    }

    @Override
    public T get() {
        return null;
    }

   
    
}
