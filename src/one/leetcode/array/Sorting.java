package one.leetcode.array;

public class Sorting {
    public static void main(String[] args) {
        int[] arr ={5,7,9,4,1,3,8,2};

    }
    public static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int mi=0, max = arr[i];
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[i]>max){
                    max=arr[i];
                    mi=i;
                }
            }
            arr[mi]=arr[arr.length-i-1];
            arr[arr.length-i-1]=max;

        }
    }
}
