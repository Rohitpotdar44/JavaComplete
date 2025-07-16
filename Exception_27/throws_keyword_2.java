package Exception_27;

// there are the checked exceptions by the compiler
import java.io.FileNotFoundException;
import java.io.FileReader;

public class throws_keyword_2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader=new FileReader("main.txt");
      
    }
}

// and whatever written in finally{} is always run regardless of the try and catch
// we can write also like this try( FileReader fileReader2=new FileReader("xyz.txt")){} -> the we don't need finally

