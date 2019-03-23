import sun.applet.Main;

import java.io.*;
import java.util.Stack;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector v = new Vector();

        exe("javap Test");

    }

    public static void exe(String command) {
            boolean flag = false;
        try {
            Process process = new ProcessBuilder(command.split(" ")).start();
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
            String s;
            while ((s = inputStream.readLine()) != null)
                System.out.println(s);
            BufferedReader inputError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            while ((s = inputError.readLine()) != null) {
                System.err.println(s);
                flag=true;
            }
        } catch (Exception e) {
            if(command.startsWith("CMD /c")){
                exe("CMD /c "+command);
            }else {

            e.printStackTrace();
            }

        }
            if (flag){
                System.out.println("出错了");
            }
    }
}
