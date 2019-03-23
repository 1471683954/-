import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class MyException {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            c();
        } catch (Exception e) {
            e.printStackTrace();
            e.printStackTrace(new PrintStream(new FileOutputStream("1.txt", true)));

        }
    }

    public static void a() throws NullPointerException {
        throw new NullPointerException();
    }

    public static void b() throws RuntimeException{
        try {
            a();
        } catch (RuntimeException e) {
          //  e.printStackTrace();
        throw new RuntimeException("b()",e);

        }


    }

    public static void c() throws Exception {
        try {
            b();
        } catch (Exception e) {
           // e.printStackTrace();
          //  throw (Exception) e.fillInStackTrace();
            throw new Exception("c()",e);
        }
    }
}
