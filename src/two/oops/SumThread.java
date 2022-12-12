package two.oops;

public class SumThread extends Thread{
    int s;
    int e;
    int[] arr;
    int sum;

    public SumThread(int s, int e, int[] arr) {
        this.s = s;
        this.e = e;
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int i = s; i < e; i++) {
            sum+=arr[i];
        }
    }
}



