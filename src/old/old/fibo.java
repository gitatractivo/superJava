package old.old;

public class fibo {
    public static void main(String[] args) {
        int n =15;
        int ans= fib(n);

        System.out.println(ans);
        ans= fibb(n);
        System.out.println(ans);
    }
    public static int fib(int n){
        int[] arr = new int[n+1];
        return fibon(arr,0,n);
    }
    static int fibon(int[] arr,int k, int n){
        if(k>n){
            return arr[n];
        }
        if(k<2){
            arr[k]=k;
        }
        else
        arr[k]=arr[k-1]+arr[k-2];
        fibon(arr,k+1,n);
//        for(int i = 2; i<=n+1;i++){
//            arr[i]=arr[i-1]+arr[i-2];
//        }
        return arr[n];
    }
    static int fibb(int n){
        int[] arr=new int[n+1];
        int i;
        for( i=0;i<2;i++){
            arr[i]=i;
        }
        for(i=2;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}
