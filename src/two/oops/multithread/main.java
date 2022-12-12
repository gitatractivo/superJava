package two.oops.multithread;


public class main  {


    public static void main(String[] args) throws Exception
    {

//        String s = "this is second quiz";
//        System.out.println(s) ;
//
//        char[] chars = new char[1];
//        s.getChars(1, 7 ,chars,1);
//        System.out.println(chars) ;

//        hello h = new hello();
//        hi h2 = new hi();
//        Thread t1 = new Thread(h);
//        try{
//            System.out.println("1");
//            Thread.sleep(20);
//            System.out.println(2);
//        }
//        catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        Thread t2 = new Thread(h2);
//        t1.start();
//        try{
//            t1.join();
//        }catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        t2.start();
        counter c1 = new counter();
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    c1.increment();
                    System.out.println("t1");
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    c1.increment();
                    System.out.println("t2");

                }
            }
        });
        t1.start();
        t2.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(c1.count);
        t1.join();
        t2.join();
        System.out.println(c1.count);




    }}
