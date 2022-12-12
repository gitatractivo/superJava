package one.leetcode.linkedlist;

public class _202 {
    public static void main(String[] args) {
        System.out.println(findsquare(15));
    }
    public boolean isHappy(int n) {
        int s = n;
        int f = n;
        do{
            s=findsquare(s);
            f=findsquare(findsquare(f));
        }while (s!=f);

        return s==1;
    }
    private static int findsquare(int n){
        int sum =0;
        while(n>0){
            sum+=(Math.pow((n%10),2));
            n/=10;
        }
        return sum;
    }

}
