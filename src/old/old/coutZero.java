package old.old;

public class coutZero {
    public static void main(String[] args) {
        int n =104850450;
        System.out.println(cout(n));
    }
    static int cout(int n){

        return cnt(n, 0);
    }
    static int cnt(int n ,int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
            count++;
        }
        return cnt(n/10, count);

    }
}
