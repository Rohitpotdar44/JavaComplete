// each has it's own responsiblity one is desined for mutability one is for
// performance reason and one for thread safety
// string is nothing but sequence of characters and string is stored in string
// pool
// by default strings are immutable ( means internal fileds of string class is
// final)

/*
 * public class Test {
 * public static void main(String[] args)
 * {
 * String strl = "Hello";
 * strl.concat( str: "World") ;
 * System.out.println (strl) ;
 * }
 * 
 * }
 * 
 * o/p is hello
 * 
 * 
 * 
 * 
 * 
 * 
 * 🔄 Immutable Strings in Simple Words:
 * When you create a String, like:
 * 

 * String str1 = "Hello";
 * That "Hello" is stored as is, and it cannot be changed.
 * 
 * Now if you do:
 * 

 * str1.concat(" World");
 * 👉 This does NOT change str1.
 * Instead, it creates a new string: "Hello World" — and unless you save it,
 * it's gone.
 * 
 * When you do:

 * String str2 = str1.concat(" World");
 * Now you've stored the new string "Hello World" in str2.
 * But str1 is still "Hello" — completely untouched.
 * 
 * 💡 Why This Matters?
 * Because immutability helps Java with:
 * 
 * Security (no one can change your string without your permission),
 * 
 * Thread safety (no surprises in multi-threading),
 * 
 * Caching and reusability (like in String Pool).
 * 
 * 
 * 
 * 
 * 🔧 Mutable Strings in Java
 * Java provides two classes for creating mutable strings:
 * 
 * StringBuilder – not thread-safe but faster
 * 
 * StringBuffer – thread-safe but a bit slower
 * 
 * ✅ What Does Mutable Mean?
 * Mutable means changeable. You can modify the content of the string object
 * without creating a new object.
 * 
 * 📦 Example: Using StringBuilder
 
 * StringBuilder sb = new StringBuilder("Hello");
 * sb.append(" World");
 * System.out.println(sb); // Output: Hello World
 * ✅ No new object is created.
 * 
 * ✅ The original "Hello" string object is updated to "Hello World".
 * 
 * ⚙️ How It Works
 * When you use StringBuilder or StringBuffer, operations like .append(),
 * .insert(), .delete(), etc., modify the same object in memory.
 * 
 * It saves memory and improves performance in situations where many string
 * changes are needed.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * // I am basically we are seeing thatneed of swing builder and spring buffer
 * OK so by using the following examplewe are able to see that this loop creates
 * thousands of temporary strings which is leads to poor performance and it uses
 * lots of memory
 * // So basically string builder and string buffer says thatinstead of creating
 * temporary links use notable strings which are modifiable by creating the new
 * string objects
 * 
 * public class Test {
 * public static void main (String [] args){
 * String result ="";
 * for (int i = 0; i<1000; i++){
 * result = result + "Hello";
 * }
 * 
 * System. out. print In (result) ;
 * }
 * 
 * 
 * 
 * 
 * // String Builder
 * 
 * 
 * String sl = "Hello";
 * StringBuilder sb = new StringBuilder("Hello");
 * sb . append(World"). append("!");
 * String = sb.toString();
 * System. out. printtn (string);
 * 
 * 
 * In this scenario basically we are seeing the working off String builderin
 * this spring builder we created one....is basically initializing that Stringin
 * this spring builder we created one normal object of String builder and the
 * halo is basically initializing that String and then we perform many
 * operations ....rse like we have many options in thatand then we perform many
 * operations such as obtained then reverse like we have many options in that
 * field just if you want to result in String then we are using two string
 * options here and we are printing that String
 * 
 * 
 * // internal working of the string builder - 
 * 
 * 
 * in the string builder there is char array of capacity 16
 * and when that array full filled the array of double it size is created and shift 1st array ele in new one
 * but string builder is not thread safe
 * String Builder is ---- Mutable , and we can do method chaining( .append(), .reverse(), .replace() etc)
 * 
 * 
 * String Builder comes with thread safety 
 * 
 * consider the scenario where two thread acccessing the same shared resourse and if we use string Biulder therere then we can't get exact desirred value , because here both are accesing at once
 * 
 * but if  we use String Buffer instead then due to thread safety we get correct result , synchronization is done , one at a time
 * 
 * 
 * 
 * 
 * when use String ----- if we want immutability(content cannot be changed) (it is also thread safe)
 * 
 * when use StringBuilder ----- if we want Mutability and does't care about thread safety and wants better performance
 * 
 * when use StringBuffer ----- if we want Mutability and thread safety but ready to compromise some performance
 * 
 * 
 * 
 * 
 * Comparison Chart 
 * 
 * 
 * // Comparison between String, StringBuilder, and StringBuffer


| Feature        | String        | StringBuilder           | StringBuffer            |
|----------------|---------------|--------------------------|--------------------------|
| Mutability     | Immutable     | Mutable                  | Mutable                  |
| Thread Safety  | Yes           | No                       | Yes                      |
| Performance    | Slow (due to immutability) | Fast (no synchronization) | Slower (due to synchronization) |
| Storage        | String pool (for literals) | Heap           | Heap                     |
| Use Case       | Small, fixed texts         | Single-threaded apps     | Multi-threaded apps     |



we can also measure there performance using System. currentTimeMittis() ;

 * 
 * 
 * 
 */
