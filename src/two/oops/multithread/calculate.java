package two.oops.multithread;

public class calculate extends Thread{
     public void table (int x){
        for (int i = 0; i < x; i++) {
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){

            }
            System.out.println(i*x + "from " + x);
        }
    }
}
