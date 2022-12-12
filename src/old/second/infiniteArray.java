package old.second;
// We are gonna use the chunk method
//first we are going to look for the chunk in which our target element will lie and then
//We will apply binary search for the same
//initially we will assume some size of an array and then create chunk of that size
//to optimise this code we can increase the size of the chunk exponentially
//

public class infiniteArray {
    public static void main(String[] args) {
        int[] arr = new int[74185296];
        for(int i=0; i<arr.length ; i++){
            arr[i]=i;

        }
        int n= 7418526;
        System.out.println(binarySearch(arr,n));
    }
    static int binarySearch(int[] arr, int n){
        int temp=2, s=0, e=1;
        while(n > arr[e]){
            temp*=2;
            s=e+1;
            e+=temp;
            if(e> arr.length-1){
                e=arr.length-1;
            }

        }


        int ans= bs(arr, n, s , e);

        return ans;
    }

    static int bs(int[] arr, int n , int s , int e){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==n){
                return mid;
            }
            else if(arr[mid]>n){
                e=mid-1;
            }
            else
                s=mid+1;
        }
        return -1;
    }

}

