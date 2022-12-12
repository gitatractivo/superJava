package old.old;

public class sortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,8,9,12,15};
        System.out.println(ans(arr));
    }
    static boolean ans(int [] arr){
        return ans1(arr,0);

    }
    static boolean ans1(int[] arr,int n){
        if(n==arr.length-1)
            return true;

        return arr[n]<arr[n+1] && ans1(arr, n+1);
    }


}
