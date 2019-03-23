import jdk.nashorn.internal.ir.Flags;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread {
   private static boolean flag = true;
    public static void main(String[] args) throws InterruptedException {


        Thread s=    new Thread(new Runnable() {
            @Override
            public void run() {
                while (flag){
//                System.out.println("dsadw");
//                System.out.println("dsadsadwdw");

                }
            }
        });
        System.out.println("开始");
        s.start();
    Thread.sleep(1000);
       flag=false;
    }
}
