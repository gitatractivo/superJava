package old.old;


public class rotated {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int n = 0;



        System.out.println(search(arr,n));
    }
    public static int search (int[] nums, int target){
        int pivot = rotate(nums);
        if(pivot==-1){
            return bs(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(nums[0]<=target){
           return bs(nums,target,0,pivot-1);
        }

        return bs(nums,target,pivot+1, nums.length-1);

    }
    public static int rotate(int[] nums){
        int s= 0, e= nums.length-1,ans=-1;
        while(s<=e){
            int m = s+(e-s)/2;
            //here we did m<e because there can be a case when
            if(nums[m+1]< nums[m] && m<e){
                return m;
            }
            else if(nums[m]< nums[m-1] &&  s<m){
                return m-1;
            }
            else if (nums[m + 1] > nums[m] && nums[s]> nums[m]) {
                e=m-1;

            }
            else{
                s=m+1;
            }
        }
        return -1;

    }
    static int bs(int[] arr, int target, int s , int e){
        boolean isAsc= arr[s]<arr[e];
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]== target){
                return mid;
            }
            else if(isAsc){
                if (target > arr[mid]){
                    s=mid+1;
                }
                else {
                    e=mid-1;
                }

            }
            else{
                if (target > arr[mid]){
                    e=mid-1;
                }
                else {
                    s=mid+1;
                }
            }
        }
        return -1;
    }
}
