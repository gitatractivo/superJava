package two.oops.exceptionHandling;

import java.util.*;

public class demo2 {
    public static void main(String[] args) {
//        Q q = new Q(0);
//        new consumer(q);
//        new producer(q);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
//        System.out.println(list);
//        list.remove(1);
        ListIterator<Integer> itr = list.listIterator();
        while(itr.hasNext()) System.out.println(itr.next());
        while(itr.hasPrevious()) System.out.println(itr.previous());

    }
}
class Q{
    int num;
    boolean valueSet = false;
    public Q(int num){
        this.num=num;
    }
    public synchronized void put(int i){
        while(valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.num=i;
        System.out.println("put : "+num);
        valueSet=true;
        notify();
    }
    public synchronized void get(){
        while(!valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("get : "+num);
        valueSet=false;
        notify();
    }

}

class producer implements Runnable{
    Q q;
    producer(Q q){
        this.q=q;
        Thread t = new Thread(this,"producer");
        t.start();
    }
    @Override
    public void run() {
        int i=0;
        while(true){
            q.put(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class consumer implements Runnable{
    Q q;
    consumer(Q q){
        this.q=q;
        Thread t = new Thread(this,"consumer");
        t.start();
    }
    @Override
    public void run() {

        while(true){
            q.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}