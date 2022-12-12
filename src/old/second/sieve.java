package old.second;
import java.util.Scanner;

public class sieve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        boolean[] arr= new boolean[n+1];

        sieve(n,arr);


    }
    //false is prime
    public static void sieve(int n, boolean[] arr){
        for(int i=2; i*i<=n; i++){
            if(!arr[i]){
                for (int j = i*2 ;j<=n; j+=i){
                    arr[j]=true;
                }


            }

        }
        for(int i=2;i<=n;i++){
            if(!arr[i]){
                System.out.println(i + " ");
            }
        }

    }


    public static boolean isPrime(int n){
        for(int i=2; i*i <= n; i ++){
            if(n % i==0){
                return false;
            }

        }
        return true;
    }
}

