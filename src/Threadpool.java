import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Threadpool {
    Lock lock = new ReentrantLock();
    private  static int count ;
    private volatile static boolean flag= false;
    public static void main(String[] args) throws InterruptedException {
        FutureTask<String> sa = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return null;
            }

        });

        sa.run();
        CountDownLatch countDownLatch = new CountDownLatch(5000);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4);
        Semaphore semaphore = new Semaphore(20);
        ExecutorService executorService = Executors.newFixedThreadPool(200);
                for (int i = 0; i <5000 ; i++)
                    executorService.submit(new Callable<Object>() {
                        @Override
                        public Object call() throws Exception {
                            return null;
                        }
                    });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                while (!flag){


                }

                       try {
                           System.out.println("wait");
                           cyclicBarrier.await();
                       //    semaphore.acquire();
                       //    Thread.sleep(1000);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       } catch (BrokenBarrierException e) {
                           e.printStackTrace();
                       }
                       count++;
                     //   semaphore.release();
                        countDownLatch.countDown();
                System.out.println(count);
                   }

        });

   flag = true;
    executorService.shutdown();
    countDownLatch.await();
        System.out.println(count+"----------------------");
    }
}
