package one.prac.rec;

public class _50 {
    public static void main(String[] args) {
        System.out.println(myPow2(2,-2));
//        System.out.println(myPow2(34.00515,-3));

//        System.out.println(Math.pow(0.00001,2147483647));
    }
    public static double myPow(double x, int n) {
        if(n==0)    return 1;
        if(n<0){
            int m = -n;
            double ans = x*myPow(x,--m);
            return 1/ans;
        }
        return x*myPow(x,--n);
    }
    public static double myPow2(double x, int n) {
        if(n==0)    return 1;
        if(n==1)    return x;
        if(n<0){
            int m = -(n+1);
            double val = myPow2(x,m/2);
            val=val*val*x;
            if(m%2==1)  val*=x;
//            val*=x;
            return 1/(val);
        }
        double val = myPow2(x,n/2);
        val*=val;
        if(n%2==1)  val*=x;

        return val;
    }
}
