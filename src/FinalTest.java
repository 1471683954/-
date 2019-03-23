public class FinalTest {

    public static void main(String[] args) {
        A a = new A(10);
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(a.getX());
            }
        }).start();
    }
}

class A {
   private int x;

    public A(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}