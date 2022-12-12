package one.prac.rec;

public class l1Ques {
    public static void main(String[] args) {
        int a = 14;
        System.out.println(count(28));
    }
    public static int rev(int n){
        int noOfDigits = (int)(Math.log10(n)) ;
        return revRec(n,noOfDigits);
    }

    private static int revRec(int n, int noOfDigits) {
        if(n%10==n) return n;
        return (n%10)*(int)(Math.pow(10,noOfDigits))+ revRec(n/10,--noOfDigits);
    }
    static boolean palin(int n){
        return n == rev(n);
    }

    static boolean palin2(int n){
        int noOfDigits = (int)(Math.log10(n)) ;
        return palinRec(n,noOfDigits);
    }

    private static boolean palinRec(int n, int noOfDigits) {
        if(noOfDigits<2) return true;
        int m = (int) (Math.pow(10,noOfDigits));
        return ((n/m)==n%10) && palinRec((n%m)/10,noOfDigits-2);
    }


    static int count(int n){
        if(n%10==n){
            return 0;
        }
        int ans=count(n/10);
        if(n%10==0) return ++ans;
        return ans;
    }
}
