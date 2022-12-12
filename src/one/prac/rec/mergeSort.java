package one.prac.rec;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,0,1,2,3,4};

//        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length==1)   return arr;
        int[] arr1 = mergeSort(Arrays.copyOfRange(arr,0,arr.length/2));
        int[] arr2 = mergeSort(Arrays.copyOfRange(arr,arr.length/2,arr.length));
        return merge(arr1,arr2);
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int i = 0, j=0,z=0;
        int l = arr1.length,k=arr2.length;
        int[] ans = new int[l+k];
        while(i<l && j<k){
            if(arr1[i]>arr2[j]){
                ans[z++]=arr2[j++];

            }
            else{
                ans[z++]=arr1[i++];
            }
        }
        while(i<l){
            ans[z++]=arr1[i++];
        }
        while(j<k){
            ans[z++]=arr2[j++];
        }
        return ans;
    }

    public static void mergeSortInPlace(int[] arr,int s, int e){
        if(e-s==1)   return;
        int mid = (s+e)/2;

        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);
        mergeInPlace(arr,s,mid,e);
    }
    public static void mergeInPlace(int[] arr, int s ,int mid, int e){
        int i = s, j=mid,z=0;

        int[] ans = new int[e-s];
        while(i<mid && j<e){
            if(arr[i]>arr[j]){
                ans[z]=arr[j];
                j++;
            }
            else{
                ans[z]=arr[i];
                i++;
            }
            z++;
        }
        while(i<mid){
            ans[z]=arr[i];
            i++;
            z++;
        }
        while(j<e){
            ans[z]=arr[j];
            j++;
            z++;
        }
        System.arraycopy(ans, 0, arr, s + 0, ans.length);
    }

}
