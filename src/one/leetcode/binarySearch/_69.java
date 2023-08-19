package one.leetcode.binarySearch;

public class _69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
    static int[] arr;
    public static int mySqrt(int x) {
        if(x <2) return x;
        return rec(x,0,x);

    }
    public static int rec(int x, int s, int e){
        int m = s+(e-s)/2;
        if(s>=e){
            return -1;
        }
        long sqr = (long)m*m;
        long sqr_1 = (long)(m+1)*(m+1);

        if(sqr<=x && sqr_1>x){
            return m;
        }

        else if(sqr<x){
            return rec(x,m,e);
        }
        return rec(x,s,m);
    }
}
