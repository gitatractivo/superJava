package old.second;
import java.util.Scanner;

public class sqrt {
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println( root(n));

    }

    public static double root (int n){
        boolean[] arr = new boolean[n+1];
        double r ;
        int s = 0;
        int e= arr.length-1;
        while(e>s){
            int mid = s+ (e-s)/2;
            if(mid*mid == n){
                r = mid;
                return r;
            }
            else if((mid*mid)>n){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }


        r = e;
        double j=0.1;
        while(j>0.00001){
            while((r*r)<n){
                r+=j;

            }
            r-=j;

            j/=10;

        }
        return r;

    }
}
