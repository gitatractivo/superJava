package two.oops.multithread.mul;

public class demo {
    public static void main(String[] args) throws Exception {
        counter c = new counter();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000000; i++) {
                c.increment();
            }
        },"T1");
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000000; i++) {
                c.increment();
            }
        },"T2");
        StringBuffer str = new StringBuffer();

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
