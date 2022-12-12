package one.leetcode.strings;

//import static leetcode.strings.sortRev.swap;

public class _268 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        System.out.println(find2(arr));
    }

    private static int find2(int[] arr) {
        int missing=0;
        int i=0;
        while (i< arr.length){
            int index = arr[i];

            if(index!=i && index<arr.length-1)    swap(arr,i,index);
            else    i++;

        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j){
                missing = j;
                break;
            }
        }
        if(missing==0 && arr[0]==0) missing = arr.length;
        return missing;
    }

    private static int find(int[] arr) {
        int missing = 0;
        boolean[] ans = new boolean[arr.length+1];
        //create an boolean array of arr + 1 length put value of each true index which exists in the array and find the false value
        for (int i = 0; i < arr.length; i++) {
            ans[arr[i]]=true;

        }
        for (int i = 0; i < ans.length; i++) {
            if(!ans[i]) missing=i;

        }

        return missing;

    }
    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
