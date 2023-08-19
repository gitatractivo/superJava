package one.leetcode.array;

import java.util.Arrays;

public class _167 {
    public static void main(String[] args) {
        int[] arr = {3,24,50,79,88,150,345};
        int target = 200;
        System.out.println(Arrays.toString(practice(arr,target)));
    }

    private static int[] twoSum2(int[] arr, int target) {
        int s =0,e =arr.length-1;
        while(s<e){
            int mid = s+(e-s)/2;
            int sum = arr[s]+arr[e];
            if (sum==target)    return new int[] {s+1,e+1};
            else if(sum<target) s=mid+1;
            else e=mid-1;

        }
        return new int[] {-1,-1};
    }

    public static int[] twoSum(int[] arr , int target){

        int ceil = ceiling(arr,target);
        if(arr[ceil]==target){
            if(target==0)   return new int[] {ceil,ceil+1};

            int zero = ceiling(arr,0);
            if(arr[zero]==0) {
                if (arr[ceil] > 0) return new int[]{zero + 1, ceil + 1};
                else return new int[]{ceil + 1, zero + 1};
            }
        }
        int i =0,j=ceil;
        while(i<j){
            int sum =arr[i]+arr[j];
            if(sum == target)   return new int[]{i+1,j+1};
            else if(sum>target) j--;
            else    i++;
        }
        return new int[] {-1,-1};
    }
    static int ceiling (int[] arr, int target){
        int s= 0;
        int e= arr.length-1;
        if (target>arr[e])   return e;

        while (s<=e){
            int mid =s+(e-s)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if (target > arr[mid]){
                    s=mid+1;
                }
            else {
                    e=mid-1;
                }

        }
        if(s+1<arr.length && arr[s]==arr[s+1]  ) {
            return s + 1;
        }
        return s;
    }

    public static int[] practice(int[] numbers,int target){
        int i = 0;
        int j = numbers.length-1;
        while(i<j){
            int a = numbers[i];
            int b = numbers[j];
            if(a+b==target) return new int[]{i+1,j+1};
            if(a+b<target){
                i++;
                continue;
            }
            j--;
        }

        return new int[2];
    }
}
