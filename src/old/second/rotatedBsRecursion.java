package old.second;

public class rotatedBsRecursion {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,1,2,3,4};
        int target = 8;
        System.out.println(rbs(arr,target,0,arr.length-1));
    }
    public static int rbs (int[] arr, int t, int s, int e){
        int mid = s+(e-s)/2;
        if(arr[mid]== t)    return mid;

        if(arr[s]<=arr[mid]){
            if(arr[s]<t && t<=arr[mid]) return rbs(arr, t, s, mid-1);
            else return rbs(arr, t, mid +1, e);

        }
        if(t>=arr[mid] && t<=arr[e]) return rbs(arr, t, mid +1, e);
        else rbs(arr, t, s, mid-1);

        return -1;
    }
}


