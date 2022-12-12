package old.second.b;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {1,5,8,2,6,7,3,4};
        sortInPlace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static int[] sort(int[] arr){
        //arr is bisected again and again till a point only 1 individual no. is left or this is the base condition
        if(arr.length==1){
            return arr;
        }
        //arr is broken into two halves now those two halves will be sorted further individually
        int mid = arr.length/2;
        //sort the left part sort the right part and then merge them
        int[] left = sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);

    }
    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length+ second.length];

        int i=0,j=0,k=0;

        //when every one of the first second hits the border condition loop will break that means for that array elements have been finished now all the elements will be added of the other array
        while(i< first.length && j<second.length){
            if(first[i]< second[j]){
                mix[k]=first[i];
                i++;

            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        //to add the elements of other array
        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;

    }
    static void sortInPlace(int[] arr,int s , int e){
        //arr is bisected again and again till a point only 1 individual no. is left or this is the base condition
        if(e-s ==1){
            return;
        }
        //arr is broken into two halves now those two halves will be sorted further individually
        int mid = s+(e-s)/2;
        //sort the left part sort the right part and then merge them
        sortInPlace(arr,s,mid);
        sortInPlace(arr,mid,e);
        mergeInPlace(arr,s,mid,e);

    }
    static void mergeInPlace(int[] arr, int s,int m , int e){
        int[] mix = new int[e-s];

        int i=s,j=m,k=0;
        //when every one of the first second hits the border condition loop will break that means for that array elements have been finished now all the elements will be added of the other array
        while(i< m && j<e ){
            if(arr[i]< arr[j]){
                mix[k]=arr[i];
                i++;

            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        //to add the elements of other array
        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while(i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j< e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int l=0; l<mix.length ; l++){
            arr[s+l]=mix[l];
        }

    }
}
