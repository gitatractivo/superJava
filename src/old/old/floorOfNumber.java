package old.old;

public class floorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target= 15;
        System.out.println(ans(arr, target));
    }

    private static int ans(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;

        boolean isAsc = arr[s]<arr[e];
        while (e>=s){
            int mid = s + ((e-s)/2);
            if(target == arr[mid]){
                return arr[mid];
            }
            else if(isAsc) {
                if (target > arr[mid]) {
                    s = mid + 1;

                } else {
                    e = mid - 1;
                }
            }
            else{
                    if(target>arr[mid]){
                        e=mid-1;


                    }
                    else{
                        s=mid+1;
                    }


            }

        }
        return arr[e];
    }
}
