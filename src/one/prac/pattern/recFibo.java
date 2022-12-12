package one.prac.pattern;

public class recFibo {
    public static void main(String[] args) {
        int n = 5;
        int[] arr= {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr,n));
    }

    private static int search(int[] arr, int target) {
        int mid =2;

        return mid;
    }

    private static int fibo(int n) {
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

}
