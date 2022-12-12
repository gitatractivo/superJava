package old.old;

public class reverseNumber {
    public static void main(String[] args) {
        int n = 123456789;
//        System.out.println(rev(n,0));
//        System.out.println(rev(n));
//        System.out.println(rev2(n));
        int[] ans = rev3(n);
        System.out.println(ans[0]);
    }
    static int rev(int n,int k){
        if(n==0){
            return k;
        }
        k=k*10+ n%10;

        int ans=rev(n/10, k);
        return ans;
    }
    public static int rev(int n){
        if(n/10==0 ){
            return n;
        }
        int ans = rev(n/10);
//take the integer value of log base 10 of rev say p then multiply n with 10*p+1
        return (n%10)*((int) Math.pow(10,(int) Math.log10(rev(n/10))+1)) + ans;
    }

    static int rev2(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        int digits = (int)(Math.log10(n)) + 1;
        return helper (n, digits);
    }
    private static int helper (int n, int digits) {
        if (n%10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow (10, digits-1)) + helper( n/10, digits -1);
    }

    public static int[] rev3(int n){
        if(n/10==0 ){
            return new int[] {n,1};
        }
        int[] ans = rev3(n/10);
        int count = ans[1];
//take the integer value of log base 10 of rev say p then multiply n with 10*p+1
        return new int[] {((n%10)*((int) Math.pow(10,count))) + ans[0] , ++count};
    }
}


