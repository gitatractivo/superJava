package two.oops.multithread;

public class thread extends calculate implements Runnable{
    int x;

    public thread(int x) {
        super();
        this.x = x;
    }

    public void run(){
        table(x);
    }
}
