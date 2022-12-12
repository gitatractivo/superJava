package old.old;

public class roof {
    public static void main(String[] args) {
        int[] arr ={1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(arr,target));

    }
    public static int searchInsert(int[] arr, int target) {
        int s= 0;
        int e= arr.length-1;
        while (s<=e){
            int mid =s+(e-s)/2;
            if(target == arr[mid]){
                return mid;
            }
            if (target > arr[mid]){
                s=mid+1;
            }
            else {
                e=mid-1;
            }

        }
        return s;


    }

}
